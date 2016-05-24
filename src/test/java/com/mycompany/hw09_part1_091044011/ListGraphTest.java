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
        int source = 0;
        int dest = 0;
        ListGraph instance = null;
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class ListGraph.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Edge edge = null;
        ListGraph instance = null;
        instance.insert(edge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edgeIterator method, of class ListGraph.
     */
    @Test
    public void testEdgeIterator() {
        System.out.println("edgeIterator");
        int source = 0;
        ListGraph instance = null;
        Iterator<Edge> expResult = null;
        Iterator<Edge> result = instance.edgeIterator(source);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdge method, of class ListGraph.
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        int source = 0;
        int dest = 0;
        ListGraph instance = null;
        Edge expResult = null;
        Edge result = instance.getEdge(source, dest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListGraph.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListGraph instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
