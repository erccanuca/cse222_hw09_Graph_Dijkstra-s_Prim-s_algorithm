/**
 * A ListGraph is an extension of the AbstractGraph abstract class that uses an
 * array of lists to represent the edges.
 *
 * @author Koffman and Wolfgang
 */
package com.mycompany.hw09_part1_091044011;

import java.util.*;

/**
 * This Class extends Abstract class and
 * Data Filed is List edges.
 * @author ercan
 */
public class ListGraph
        extends AbstractGraph {

    // Data Field
    /**
     * An array of Lists to contain the edges that originate with each vertex.
     */
    private List<Edge>[] edges;

    /**
     * Construct a graph with the specified number of vertices and
     * directionality.
     *
     * @param numV The number of vertices
     * @param directed The directionality flag
     */
    public ListGraph(int numV, boolean directed) {
        super(numV, directed);
        edges = new List[numV];
        for (int i = 0; i < numV; i++) {
            edges[i] = new LinkedList< Edge>();
        }
    }

    /**
     * Determine whether an edge exists.
     *
     * @param source The source vertex
     * @param dest The destination vertex
     * @return true if there is an edge from source to dest
     */
    @Override
    public boolean isEdge(int source, int dest) {
        return edges[source+1].contains(new Edge(source, dest));
    }

    /**
     * Insert a new edge into the graph.
     *
     * @param edge The new edge
     */
    @Override
    public void insert(Edge edge) {
        edges[edge.getSource()].add(edge);
        if (!isDirected()) {
            edges[edge.getDest()].add(new Edge(edge.getDest(),
                    edge.getSource(),
                    edge.getWeight()));
        }
    }
    /**
     * This method iterator of list Graph
     * @param source source of edge
     * @return iterator by using source
     */
    @Override
    public Iterator< Edge> edgeIterator(int source) {
        return edges[source].iterator();
    }

    /**
     * Get the edge between two vertices. If an edge does not exist, an Edge
     * with a weight of Double.POSITIVE_INFINITY is returned.
     *
     * @param source The source
     * @param dest The destination
     * @return the edge between these two vertices
     */
    @Override
    public Edge getEdge(int source, int dest) {
        Edge target
                = new Edge(source, dest, Double.POSITIVE_INFINITY);
        for (Edge edge : edges[source]) {
            if (edge.equals(target)) {
                return edge; // Desired edge found, return it.
            }
        }
        // Assert: All edges for source checked.
        return target; // Desired edge not found.
    }

    /**
     * This method return info about this class
     * @return string informations.
     */
    @Override
    public String toString() {
        StringBuilder returned = new StringBuilder();
        for (int i = 0; i < edges.length; ++i) {
            for (int j = 0; j < edges[i].size(); ++j) {
                returned.append(edges[i].get(j)).append("->");
            }
        }
        returned.append("\n");
        return returned.toString();
    }

}
