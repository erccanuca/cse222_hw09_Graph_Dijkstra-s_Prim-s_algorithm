/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

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
public class EdgeTest {
    
    public EdgeTest() {
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
     * Test of getWeight method, of class Edge.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Edge instance = new Edge(1, 2);
        double expResult = 1.0;
        double result = instance.getWeight();
        assertEquals(expResult, result,1.0);
       
    }

    /**
     * Test of setWeight method, of class Edge.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        double weight = 1.0;
        Edge instance = new Edge(1, 2, 2.0);
        instance.setWeight(weight);
        assertEquals(weight, instance.getWeight(),1.0);
        
    }

    /**
     * Test of getSource method, of class Edge.
     */
    @Test
    public void testGetSource() {
        System.out.println("getSource");
        Edge instance = new Edge(1, 2);
        int expResult = 1;
        int result = instance.getSource();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSource method, of class Edge.
     */
    @Test
    public void testSetSource() {
        System.out.println("setSource");
        int source = 1;
        Edge instance = new Edge(1, 2);
        instance.setSource(source);
        assertEquals(source,instance.getSource(),1);
        
    }

    /**
     * Test of getDest method, of class Edge.
     */
    @Test
    public void testGetDest() {
        System.out.println("getDest");
        Edge instance = new Edge(1, 2);
        int expResult = 2;
        int result = instance.getDest();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDest method, of class Edge.
     */
    @Test
    public void testSetDest() {
        System.out.println("setDest");
        int dest = 2;
        Edge instance = new Edge(1, 2);
        instance.setDest(dest);
        assertEquals(dest, instance.getDest(),2);
       
    }

    /**
     * Test of hashCode method, of class Edge.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Edge instance = new Edge(1, 2);
        Edge instance2 = new Edge(1, 2);
        int expResult =instance2.hashCode() ;
        int result = instance.hashCode();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of equals method, of class Edge.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Edge(1, 2);
        Object obj2 = new Edge(1, 2);
        Edge instance = new Edge(1, 2);
        Edge instance2 = new Edge(1, 2);
        boolean expResult = instance2.equals(obj2);
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class Edge.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Edge instance = new Edge(1, 2);
        System.out.println(instance.toString());
        String expResult = "\t2-->\t3\t1.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
