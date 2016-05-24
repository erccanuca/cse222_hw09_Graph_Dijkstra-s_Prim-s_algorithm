/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.util.Iterator;
import java.util.Scanner;
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
public class AbstractGraphTest {
    
    public AbstractGraphTest() {
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
     * Test of getNumV method, of class AbstractGraph.
     */
    @Test
    public void testGetNumV() {
        System.out.println("getNumV");
        AbstractGraph instance = null;
        int expResult = 0;
        int result = instance.getNumV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDirected method, of class AbstractGraph.
     */
    @Test
    public void testIsDirected() {
        System.out.println("isDirected");
        AbstractGraph instance = null;
        boolean expResult = false;
        boolean result = instance.isDirected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadEdgesFromFile method, of class AbstractGraph.
     */
    @Test
    public void testLoadEdgesFromFile() {
        System.out.println("loadEdgesFromFile");
        Scanner scan = null;
        AbstractGraph instance = null;
        instance.loadEdgesFromFile(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFullGraph method, of class AbstractGraph.
     */
    @Test
    public void testLoadFullGraph() throws Exception {
        System.out.println("loadFullGraph");
        String filename = "";
        AbstractGraph instance = null;
        instance.loadFullGraph(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dijkstrasAlgorithm method, of class AbstractGraph.
     */
    @Test
    public void testDijkstrasAlgorithm() {
        System.out.println("dijkstrasAlgorithm");
        Graph graph = null;
        int start = 0;
        int[] pred = null;
        double[] dist = null;
        AbstractGraph instance = null;
        instance.dijkstrasAlgorithm(graph, start, pred, dist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AbstractGraph.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Edge edge = null;
        AbstractGraph instance = null;
        instance.insert(edge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEdge method, of class AbstractGraph.
     */
    @Test
    public void testIsEdge() {
        System.out.println("isEdge");
        int source = 0;
        int dest = 0;
        AbstractGraph instance = null;
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdge method, of class AbstractGraph.
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        int source = 0;
        int dest = 0;
        AbstractGraph instance = null;
        Edge expResult = null;
        Edge result = instance.getEdge(source, dest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edgeIterator method, of class AbstractGraph.
     */
    @Test
    public void testEdgeIterator() {
        System.out.println("edgeIterator");
        int source = 0;
        AbstractGraph instance = null;
        Iterator<Edge> expResult = null;
        Iterator<Edge> result = instance.edgeIterator(source);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractGraphImpl extends AbstractGraph {

        public AbstractGraphImpl() {
            super(0, false);
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
