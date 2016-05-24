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
public class ListGraphTest {
    
    public ListGraphTest() {
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
     * Test of isEdge method, of class ListGraph.
     */
    @Test
    public void testIsEdge() {
        System.out.println("isEdge");
        int source = -1;
        int dest = 0;
        ListGraph instance = new ListGraph(3, false);
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        //System.out.println("result:"+result);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of insert method, of class ListGraph.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Edge edge = new Edge(1, 2);
        ListGraph instance = new ListGraph(2, true);
        instance.insert(edge);
        
    }

    /**
     * Test of edgeIterator method, of class ListGraph.
     */
    @Test
    public void testEdgeIterator() {
        System.out.println("edgeIterator");
        int source = 0;
        ListGraph instance = new ListGraph(2, true);
        ListGraph instance2 = new ListGraph(2, true);
        Iterator<Edge> expResult = instance.edgeIterator(source);
        Iterator<Edge> result = instance2.edgeIterator(source);
        assertEquals(expResult.hasNext(), result.hasNext());
    }

    /**
     * Test of getEdge method, of class ListGraph.
     */
    @Test(expected = NullPointerException.class)
    public void testGetEdge() {
        System.out.println("getEdge");
        int source = 1;
        int dest = 2;
        ListGraph instance = null;
        Edge expResult = null;
        Edge result = instance.getEdge(source, dest);
        assertEquals(expResult,result);
        
    }

    /**
     * Test of toString method, of class ListGraph.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListGraph instance = new ListGraph(1, true);
        String expResult = "\n";
        
        String result = instance.toString();
       // System.err.println("res:"+result);
        assertEquals(expResult, result);
       
    }
    
}
