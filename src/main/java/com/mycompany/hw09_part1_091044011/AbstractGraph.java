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

    /**
     * Constructor with 2 parameters.
     *
     * @param numV this is total edges number
     * @param directed true if directed, otherwise false.
     */
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
     * @param scan This is for using file and find lines and informations into
     * lines.
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
                    insert(new Edge(source - 1, dest - 1, wieght));
                    //System.out.println("arr:"+arr.toString());
                    arr.removeAll(arr);
                    counter = 0;
                }

            }
        }
    }

    /**
     * Load our graph
     *
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
     * Insert a new edge into the graph.
     *
     * @param edge The new edge
     */
    @Override
    abstract public void insert(Edge edge);

    /**
     * Determine whether an edge exists.
     *
     * @param source The source vertex
     * @param dest The destination vertex
     * @return true if there is an edge from source to dest
     */
    @Override
    abstract public boolean isEdge(int source, int dest);

    /**
     * Get the edge between two vertices. If an edge does not exist, an Edge
     * with a weight of Double.POSITIVE_INFINITY is returned.
     *
     * @param source The source
     * @param dest The destination
     * @return the edge between these two vertices
     */
    @Override
    abstract public Edge getEdge(int source, int dest);

    /**
     * This method iterator of Graph
     *
     * @param source source of edge
     * @return iterator by using source
     */
    @Override
    abstract public Iterator<Edge> edgeIterator(int source);
}
