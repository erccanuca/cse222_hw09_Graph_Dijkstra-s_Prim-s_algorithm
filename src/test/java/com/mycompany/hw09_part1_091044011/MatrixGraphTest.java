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
public class MatrixGraphTest {
    
    public MatrixGraphTest() {
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
     * Test of insert method, of class MatrixGraph.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Edge edge = new Edge(1, 2);
        MatrixGraph instance = new MatrixGraph(4, true);
        instance.insert(edge);
       
    }

    /**
     * Test of isEdge method, of class MatrixGraph.
     */
    @Test
    public void testIsEdge() {
        System.out.println("isEdge");
        int source = 0;
        int dest = 0;
        MatrixGraph instance = new MatrixGraph(4, true);
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEdge method, of class MatrixGraph.
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        int source = 1;
        int dest = 2;
        MatrixGraph instance = new MatrixGraph(4, true);
        Edge expResult = new Edge(1, 2,9999.0);
        Edge result = instance.getEdge(source, dest);
        assertEquals(expResult.toString(), result.toString());
        
    }

    /**
     * Test of edgeIterator method, of class MatrixGraph.
     */
    @Test
    public void testEdgeIterator() {
        System.out.println("edgeIterator");
        int source = 0;
        MatrixGraph instance = new MatrixGraph(4, true);
        MatrixGraph instance2 = new MatrixGraph(4, true);
        Iterator<Edge> expResult = instance.edgeIterator(source);
        Iterator<Edge> expResult2 = instance2.edgeIterator(source);
        
        assertEquals(expResult.hasNext(), expResult2.hasNext());
       
    }

    /**
     * Test of toString method, of class MatrixGraph.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MatrixGraph instance = new MatrixGraph(1, true);
        
        String expResult = "	|&|\n";
        String result = instance.toString();
        //System.err.println("res:"+result);
        assertEquals(expResult, result);
       
    }
    
}
