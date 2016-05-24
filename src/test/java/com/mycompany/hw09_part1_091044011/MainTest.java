/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.util.ArrayList;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of matrixGraphTest method, of class Main.
     */
    @Test
    public void testMatrixGraphTest() throws Exception {
        System.out.println("matrixGraphTest");
        Main.matrixGraphTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listGraphTest method, of class Main.
     */
    @Test
    public void testListGraphTest() throws Exception {
        System.out.println("listGraphTest");
        Main.listGraphTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DijkstraAlgorithm_Test method, of class Main.
     */
    @Test
    public void testDijkstraAlgorithm_Test() {
        System.out.println("DijkstraAlgorithm_Test");
        AbstractGraph graph = null;
        int vertexNum = 0;
        Main.DijkstraAlgorithm_Test(graph, vertexNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrimAlgorithm_Test method, of class Main.
     */
    @Test
    public void testPrimAlgorithm_Test() {
        System.out.println("PrimAlgorithm_Test");
        AbstractGraph graph = null;
        int vertexNum = 0;
        Main.PrimAlgorithm_Test(graph, vertexNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of primsAlgorithm method, of class Main.
     */
    @Test
    public void testPrimsAlgorithm() {
        System.out.println("primsAlgorithm");
        Graph graph = null;
        int start = 0;
        ArrayList<Edge> expResult = null;
        ArrayList<Edge> result = Main.primsAlgorithm(graph, start);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
