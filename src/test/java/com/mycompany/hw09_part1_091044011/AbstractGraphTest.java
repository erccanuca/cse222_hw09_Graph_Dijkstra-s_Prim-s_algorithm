/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.io.File;
import java.io.FileNotFoundException;
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
        AbstractGraphImpl instance = new AbstractGraphImpl();
        int expResult = 0;
        int result = instance.getNumV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isDirected method, of class AbstractGraph.
     */
    @Test
    public void testIsDirected() {
        System.out.println("isDirected");
        AbstractGraphImpl instance = new AbstractGraphImpl();
        boolean expResult = false;
        boolean result = instance.isDirected();
        assertEquals(expResult, result);
    }

    /**
     * Test of loadEdgesFromFile method, of class AbstractGraph.
     */
    @Test
    public void testLoadEdgesFromFile() throws FileNotFoundException {
        System.out.println("loadEdgesFromFile");
        File file = new File("10_0.2.xml");
        Scanner scan = new Scanner(file);
        AbstractGraphImpl instance = new AbstractGraphImpl();
        instance.loadEdgesFromFile(scan);
       
    }

    /**
     * Test of loadFullGraph method, of class AbstractGraph.
     */
    @Test
    public void testLoadFullGraph() throws Exception {
        System.out.println("loadFullGraph");
        String filename = "10_0.2.xml";
        AbstractGraphImpl instance = new AbstractGraphImpl();
        instance.loadFullGraph(filename);
       
    }

    /**
     * Test of dijkstrasAlgorithm method, of class AbstractGraph.
     */
    @Test
    public void testDijkstrasAlgorithm() {
        System.out.println("dijkstrasAlgorithm");
        Graph graph = new AbstractGraphImpl();
        int start = 0;
        int[] pred = null;
        double[] dist = null;
        AbstractGraphImpl instance = new AbstractGraphImpl();
        instance.dijkstrasAlgorithm(graph, start, pred, dist);
     
    }

    /**
     * Test of insert method, of class AbstractGraph.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Edge edge = new Edge(1, 2);
        AbstractGraphImpl instance = new AbstractGraphImpl();
        instance.insert(edge);
        
    }

    /**
     * Test of isEdge method, of class AbstractGraph.
     */
    @Test
    public void testIsEdge() {
        System.out.println("isEdge");
        int source = 0;
        int dest = 0;
        AbstractGraphImpl instance = new AbstractGraphImpl();
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEdge method, of class AbstractGraph.
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        int source = 0;
        int dest = 0;
        AbstractGraphImpl instance = new AbstractGraphImpl();
        Edge expResult = null;
        Edge result = instance.getEdge(source, dest);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of edgeIterator method, of class AbstractGraph.
     */
    @Test
    public void testEdgeIterator() {
        System.out.println("edgeIterator");
        int source = 0;
        AbstractGraphImpl instance = new AbstractGraphImpl();
        Iterator<Edge> expResult = instance.edgeIterator(source);
        Iterator<Edge> result = instance.edgeIterator(source);
        assertEquals(expResult, result);
       
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
