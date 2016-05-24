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
public class CompareEdgesTest {
    
    public CompareEdgesTest() {
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
     * Test of compare method, of class CompareEdges.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Edge e1 = new Edge(1, 2);
        Edge e2 = new Edge(1, 2);
        CompareEdges instance = new CompareEdges();
        int expResult = 0;
        int result = instance.compare(e1, e2);
        assertEquals(expResult, result);
      
    }
    
}
