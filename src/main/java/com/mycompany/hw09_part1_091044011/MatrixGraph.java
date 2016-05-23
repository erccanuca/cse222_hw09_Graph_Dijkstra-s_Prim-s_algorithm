/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author ercan
 */
public class MatrixGraph extends AbstractGraph {
    /**
     * edges 2 dimension array
     */
    private double[][] edges;
    /**
     * Constructor with 2 parameters
     * @param numV point of matrix
     * @param directed directed control
     */
    public MatrixGraph(int numV, boolean directed) {
        super(numV, directed);
        edges = new double[numV][numV];
        for (int i = 0; i < numV; i++) {
            for (int j = 0; j < numV; j++) {
                edges[i][j] = Double.POSITIVE_INFINITY;
            }
        }
    }
    /**
     * This method insert new edge
     * @param edge this edge will add
     */
    @Override
    public void insert(Edge edge) {
        edges[edge.getSource()][edge.getDest()] = edge.getWeight();
        if (!isDirected()) {
            edges[edge.getDest()][edge.getSource()] = edge.getWeight();
        }
    }
    /**
     * This method control edge is an edge,
     * controlling with source and destination
     * @param source source of edge
     * @param dest destination of edge
     * @return True if is an edge, otherwise false.
     */
    @Override
    public boolean isEdge(int source, int dest) {
        return edges[source][dest] != Double.POSITIVE_INFINITY;
    }
    /**
     * This method return an edge when know edge info.
     * @param source source of edge
     * @param dest destination of edge
     * @return an edge
     */
    @Override
    public Edge getEdge(int source, int dest) {
        return new Edge(source, dest, edges[source][dest]);
    }
    /**
     * This method return Edge Iterator
     * @param source source of edge
     * @return Iterator class
     */
    @Override
    public Iterator<Edge> edgeIterator(int source) {
        return new IteratorEdge(source);
    }
    
    /**
     * This method return info about this class
     * @return string informations.
     */
    @Override
    public String toString() {
        StringBuilder returned = new StringBuilder();
        for (int i = 0; i < edges.length; ++i) {
            for (int j = 0; j < edges.length; ++j) {
                returned.append(edges[i][j]).append("-");
            }
            returned.append("\n");
        }
        return returned.toString();
    }

    /**
     * This inner Class for Edge iterator
     */
    private class IteratorEdge implements Iterator {
        // Data fields
        /**
         * source of edge
         */
        int source;
        /**
         * matrix column
         */
        int column = 0;
        /**
         * Last column
         */
        int lastColumn = -1;
        /**
         * Returned last edge
         */
        Edge lastItemReturned;
        /**
         * Constructor 1 parameter
         * @param source source of edge
         */
        public IteratorEdge(int source) {
            this.source = source;
            lastItemReturned = null;
        }
        /**
         * This Method has next element controlling.
         * @return true if has next element,otherwise false.
         */
        @Override
        public boolean hasNext() {
            return column < edges.length;
        }

        /**
         * This method return next edge
         * @return Next edge
         */
        @Override
        public Edge next() {
            lastItemReturned = null;
            if (hasNext()) {
                lastItemReturned = new Edge(source, column, edges[source][column]);
                if ((edges[source][column] != Double.POSITIVE_INFINITY
                        && column < edges.length)) {
                    ++column;
                } else {
                    while (column < edges.length && edges[source][column] == Double.POSITIVE_INFINITY) {
                        ++column;//source ile coloum arasinda edge yoksa coloum artar
                    }
                }

            }
            if (lastItemReturned != null) {
                lastColumn = column;
            }
            return lastItemReturned;
        }
        /**
         * This method remove an edge
         * exception NoSuchElementException
         */
        @Override
        public void remove() {
            if (lastColumn != -1) {
                edges[source][lastColumn] = Double.POSITIVE_INFINITY;
                lastColumn = -1;
            } else if (lastColumn == -1) {
                throw new NoSuchElementException();
            }

        }
    }
}
