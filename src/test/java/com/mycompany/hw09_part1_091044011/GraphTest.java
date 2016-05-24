/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class GraphTest {
    
    public GraphTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumV method, of class Graph.
     */
    @Test
    public void testGetNumV() {
        System.out.println("getNumV");
        Graph instance = new GraphImpl();
        int expResult = 0;
        int result = instance.getNumV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isDirected method, of class Graph.
     */
    @Test
    public void testIsDirected() {
        System.out.println("isDirected");
        Graph instance = new GraphImpl();
        boolean expResult = false;
        boolean result = instance.isDirected();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of insert method, of class Graph.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Edge edge = null;
        Graph instance = new GraphImpl();
        instance.insert(edge);
      
    }

    /**
     * Test of isEdge method, of class Graph.
     */
    @Test
    public void testIsEdge() {
        System.out.println("isEdge");
        int source = 0;
        int dest = 0;
        Graph instance = new GraphImpl();
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEdge method, of class Graph.
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        int source = 0;
        int dest = 0;
        Graph instance = new GraphImpl();
        Edge expResult = null;
        Edge result = instance.getEdge(source, dest);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of edgeIterator method, of class Graph.
     */
    @Test
    public void testEdgeIterator() {
        System.out.println("edgeIterator");
        int source = 0;
        Graph instance = new GraphImpl();
        Iterator<Edge> expResult = null;
        Iterator<Edge> result = instance.edgeIterator(source);
        assertEquals(expResult, result);
       
    }

    public class GraphImpl implements Graph {

        public int getNumV() {
            return 0;
        }

        public boolean isDirected() {
            return false;
        }

        public void insert(Edge edge) {
        }

        public boolean isEdge(int source, int dest) {
            return false;
        }

        public Edge getEdge(int source, int dest) {
            return null;
        }

        public Iterator<Edge> edgeIterator(int source) {
            return null;
        }
    }
    
}
