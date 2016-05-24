/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class matrix graph data fields double 2 dimension array.
 * @author ercan
 */
public class MatrixGraph extends AbstractGraph {

    /**
     * edges 2 dimension array
     */
    private double[][] edges;
    /**
     * This is infinity value for unused.
     */
    private final static double infinity=9999.0;
    /**
     * Constructor with 2 parameters
     *
     * @param numV point of matrix
     * @param directed directed control
     */

    public MatrixGraph(int numV, boolean directed) {
        super(numV, directed);
        
        System.out.println("numV:"+numV);
        edges = new double[numV][numV];
        for (int i = 0; i < numV; i++) {
            for (int j = 0; j < numV; j++) {
                edges[i][j] = infinity;
            }
        }
    }

    /**
     * This method insert new edge
     *
     * @param edge this edge will add
     */
    @Override
    public void insert(Edge edge) {
        //System.out.println(toString());
        edges[edge.getSource()][edge.getDest()] = edge.getWeight();
        if (!isDirected()) {
            edges[edge.getDest()][edge.getSource()] = edge.getWeight();
        }
    }

    /**
     * This method control edge is an edge, controlling with source and
     * destination
     *
     * @param source source of edge
     * @param dest destination of edge
     * @return True if is an edge, otherwise false.
     */
    @Override
    public boolean isEdge(int source, int dest) {
        return edges[source][dest] != infinity;
    }

    /**
     * This method return an edge when know edge info.
     *
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
     *
     * @param source source of edge
     * @return Iterator class
     */
    @Override
    public Iterator<Edge> edgeIterator(int source) {
        return new IteratorEdge(source);
    }

    /**
     * This method return info about this class
     *
     * @return string informations.
     */
    @Override
    public String toString() {
        StringBuilder returned = new StringBuilder();
        for (int i = 0; i < edges.length; ++i) {
            returned.append("\t");
            for (int j = 0; j < edges.length; ++j) {
                if(edges[i][j]==infinity){
                    returned.append("|&|");
                }else{
                    returned.append("|").append(edges[i][j]).append("|");
                }
                
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
         *
         * @param source source of edge
         */
        public IteratorEdge(int source) {
            this.source = source;
            lastItemReturned = null;
        }

        /**
         * This Method has next element controlling.
         *
         * @return true if has next element,otherwise false.
         */
        @Override
        public boolean hasNext() {
            return column < edges.length;
        }

        /**
         * This method return next edge
         *
         * @return Next edge
         */
        @Override
        public Edge next() {
            
            lastItemReturned = null;
            if (hasNext()) {
                //System.out.println("-source:"+source+"col:"+column+"-len:"+edges.length);
                if(source-1==-1)
                    source=1;
                lastItemReturned = new Edge(source, column, edges[source-1][column]);
                if (column == edges.length) {
                    column = 0;
                }
                
                if ((edges[source-1][column] != infinity && column < edges.length)) {
                    ++column;
                } else {
                    while (column < edges.length && edges[source-1][column] == infinity) {
                        ++column;
                    }
                }
                
                
            }
            if (lastItemReturned != null) {
                lastColumn = column;
            }

            return lastItemReturned;
        }

        /**
         * This method remove an edge exception NoSuchElementException
         */
        @Override
        public void remove() {
            if (lastColumn != -1) {
                edges[source][lastColumn] = infinity;
                lastColumn = -1;
            } else if (lastColumn == -1) {
                throw new NoSuchElementException();
            }

        }
    }
}
