/**
 * Abstract base class for graphs. A graph is a set of vertices and a set of
 * edges. Vertices are represented by integers from 0 to n - 1. Edges are
 * ordered pairs of vertices.
 *
 * @author Koffman and Wolfgang
 */
package com.mycompany.hw09_part1_091044011;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ercan
 */
public abstract class AbstractGraph
        implements Graph {

    // Data Fields
    /**
     * The number of vertices
     */
    private int numV;

    /**
     * Flag to indicate whether this is a directed graph
     */
    private boolean directed;


    public AbstractGraph(int numV, boolean directed) {
        this.numV = numV;
        this.directed = directed;
    }

    // Accessor Methods
    /**
     * Return the number of vertices.
     *
     * @return The number of vertices
     */
    @Override
    public int getNumV() {
        return numV;
    }

    /**
     * Return whether this is a directed graph.
     *
     * @return true if this is a directed graph
     */
    @Override
    public boolean isDirected() {
        return directed;
    }

    // Other Methods
    /**
     * Load the edges of a graph from the data in an input file. The file should
     * contain a series of lines, each line with two or three data values. The
     * first is the source, the second is the destination, and the optional
     * third is the weight.
     *
     * @param scan
     */
    public void loadEdgesFromFile(Scanner scan) {
        //this code is a text exercise… this version defaults to unweighted graph
        String junkLines, word;
        String[] edges, temp, vertex = null;
        ArrayList arr = new ArrayList();
        int counter = 0;
        junkLines = scan.nextLine();
        junkLines = scan.nextLine();
        junkLines = scan.nextLine();

        while (scan.hasNext()) {
            junkLines = scan.nextLine();
            word = scan.next();
            word = scan.next();

            while (scan.hasNext() && !word.equals("/>")) {

                word = scan.next();

                if (!word.equals("/>") && !word.equals("<Edge") && !word.equals("Name=\"e1\"")) {
                    edges = word.split("=\"e");
                    //System.out.println("edges=."+edges[0]+".");
                    temp = edges[0].split("\"");
                    temp = edges[0].split("\"");
                    // System.out.println("temp=."+temp[1]+".");
                    counter++;
                    //String temp_ = temp[1].substring(1);
                    if (counter <= 2) {
                        arr.add(temp[1].substring(1));
                    } else {
                        arr.add(temp[1]);
                    }
                }
                if (counter == 3) {
                    int source = Integer.parseInt((String) arr.get(0));
                    int dest = Integer.parseInt((String) arr.get(1));
                    double wieght = Double.parseDouble((String) arr.get(2));
                    insert(new Edge(source-1, dest-1, wieght));
                    //System.out.println("arr:"+arr.toString());
                    arr.removeAll(arr);
                    counter = 0;
                }

            }
        }
    }

   /**
    *  load graph
    * @param filename file name is our .xml file
    * @throws FileNotFoundException When file is not found
    */
    public void loadFullGraph(String filename) throws FileNotFoundException {

        try {
            File source = new File(filename);
            Scanner scan;
            scan = new Scanner(source);
            this.loadEdgesFromFile(scan);
        } catch (FileNotFoundException ex) {
            System.err.println("File is not found!. File name is " + filename);
        }
    }

    /**
     * Dijkstra’s Shortest-Path algorithm.
     *
     * @param graph The weighted graph to be searched
     * @param start The start vertex
     * @param pred Output array to contain the predecessors in the shortest path
     * @param dist Output array to contain the distance in the shortest path
     */
    public void dijkstrasAlgorithm(Graph graph,
            int start,
            int[] pred,
            double[] dist) {
        
        int numV = graph.getNumV();
        HashSet<Integer> vMinusS = new HashSet<Integer>(numV);
        for (int i = 0; i < numV; ++i) {
            if (i != start) {
                vMinusS.add(i);
            }
        }
        
        for (int v : vMinusS) {
            pred[v] = start;
            dist[v] = graph.getEdge(start, v).getWeight();
        }
        while (vMinusS.size() != 0) {
            double minDist = Double.POSITIVE_INFINITY;
            int u = -1;
            for (int v : vMinusS) {
                if (dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }
            vMinusS.remove(u);
            for (int v : vMinusS) {
                if (graph.isEdge(u, v)) {
                    double weight = graph.getEdge(u, v).getWeight();
                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pred[v] = u;
                    }
                }
            }
        }
    }


    /**
     * Factory method to create a graph and load the data from an input file.
     * The first line of the input file should contain the number of vertices.
     * The remaining lines should contain the edge data as described under
     * loadEdgesFromFile.
     *
     * @param bR The BufferedReader that is connected to the file that contains
     * the data
     * @param isDirected true if this is a directed graph, false otherwise
     * @param type The string "Matrix" if an adjacency matrix is to be created,
     * and the string "List" if an adjacency list is to be created
     * @return
     * @throws IOException if there is an I/O error
     * @throws IllegalArgumentException if type is neither "Matrix" nor "List"
     */
    /*public static Graph createGraph(BufferedReader bR,
     boolean isDirected,
     String type) throws IOException {
     String line = bR.readLine();
     int numV = Integer.parseInt(line);
     AbstractGraph returnValue = null;
     if (type.equalsIgnoreCase("Matrix")) {
     returnValue = new MatrixGraph(numV, isDirected);
     } else if (type.equalsIgnoreCase("List")) {
     returnValue = new ListGraph(numV, isDirected);
     } else {
     throw new IllegalArgumentException();
     }
     returnValue.loadEdgesFromFile(bR);
     return returnValue;
     }*/
    @Override
    abstract public void insert(Edge edge);

    @Override
    abstract public boolean isEdge(int source, int dest);

    @Override
    abstract public Edge getEdge(int source, int dest);

    @Override
    abstract public Iterator<Edge> edgeIterator(int source);
}
