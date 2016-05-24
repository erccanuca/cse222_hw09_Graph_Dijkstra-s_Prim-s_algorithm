/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * This method Test all class
 * @author ercan
 */
public class Main {
    /**
     * Our main main class test
     * @param args command line args
     * @throws FileNotFoundException When file is not find out.
     */
    public static void main(String[] args) throws FileNotFoundException {
     
            System.out.println("----------Matrix Graph Test-----------");
            long startTime = System.currentTimeMillis();
            matrixGraphTest();
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.printf("matrixGraphTest:Took approximately %dm-%ds-%dms-%dns\n",
                                        ((totalTime)/1000)/60, (totalTime)/1000,(totalTime)%1000,(totalTime)/10000000);
            System.out.println("-------Matrix Graph Test END-----------\n\n");
            System.out.println("----------List Graph Test--------------");
            
            long startTime2 = System.currentTimeMillis();
            listGraphTest();
            System.out.println("--------List Graph Test END------------");
            long endTime2 = System.currentTimeMillis();
            long totalTime2 = endTime2 - startTime2;
            System.out.printf("listGraphTest:Took approximately %dm-%ds-%dms-%dns\n",
                                        ((totalTime2)/1000)/60, (totalTime2)/1000,(totalTime2)%1000,(totalTime2)/10000000);
            System.out.printf("matrixGraphTest:Took approximately %dm-%ds-%dms-%dns\n",
                                        ((totalTime)/1000)/60, (totalTime)/1000,(totalTime)%1000,(totalTime)/10000000);
        

    }
    /**
     * Matrix graph tests
     * @throws FileNotFoundException When file is not find out.
     */
    public static void matrixGraphTest() throws FileNotFoundException {

        matrixTest_1();
        matrixTest_2();
        matrixTest_3();
        matrixTest_4();
        matrixTest_5();
        matrixTest_6();
        matrixTest_7();
        matrixTest_8();
        matrixTest_9();
        matrixTest_10();
        matrixTest_11();
        matrixTest_12();
        matrixTest_13();
        matrixTest_14();
        matrixTest_15();
        matrixTest_16();
        matrixTest_17();
        matrixTest_18();
        matrixTest_19();
        matrixTest_20();
       // matrixTest_21();

    }
    /**
     * List Graph tests
     * @throws FileNotFoundException When file is not find out.
     */
    public static void listGraphTest() throws FileNotFoundException {
        ListTest_1();
        ListTest_2();
        ListTest_3();
        ListTest_4();
        /*ListTest_5();
        ListTest_6();
        ListTest_7();
        ListTest_8();
        ListTest_9();
        ListTest_10();
        ListTest_11();
        ListTest_12();
        ListTest_13();
        ListTest_14();
        ListTest_15();
        ListTest_16();
        ListTest_17();
        ListTest_18();
        ListTest_19();
        ListTest_20();
        ListTest_21();*/
    }
    /**
     * Dijkstra Algorithm Test 
     * @param graph Abstract class type
     * @param vertexNum number of vertex.
     */
    public static void DijkstraAlgorithm_Test(AbstractGraph graph, int vertexNum) {
        System.out.println("\n\t--------------Dijkstra Algoritm Test----------");
        int[] pred = new int[vertexNum];
        double[] dist = new double[vertexNum];
       
        graph.dijkstrasAlgorithm(graph, 1, pred, dist);
        System.out.println("\tPred\tDist\tWeight");
        System.out.println("\t-----\t-----\t------");
        for (int j = 0; j < vertexNum; ++j) {
            System.out.printf("\t" + j + "  --> ");
            System.out.printf("\t" + pred[j] + "");
            System.out.println("\t" + dist[j]);
        }
        System.out.println("\n\t---------Dijkstra Algoritm Test END------\n");

    }
    /**
     * Prim's Algorithm Test
     * @param graph Abstract class type
     * @param vertexNum number of vertex. 
     */
    public static void PrimAlgorithm_Test(AbstractGraph graph, int vertexNum) {
        System.out.println("\t--------------Prim Algoritm Test----------");
        ArrayList minSpanTree = new ArrayList();
        minSpanTree = primsAlgorithm(graph, 0);
        //System.out.println(minSpanTree.toString());
        System.out.println("\tSource\tDest\tWeight");
        System.out.println("\t------\t----\t------");
        for (int i = 0; i < minSpanTree.size(); ++i) {
            System.out.println(minSpanTree.get(i));
        }
        System.out.println("\t-----------Prim Algoritm Test END----------");
    }
   
    private static void matrixTest_1() throws FileNotFoundException {
        System.out.println("\t-----------Test 1 10_0.2xml------------");
        int vertexNum = 11;
        String file = "10_0.2.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 1 10_0.2xml END---------");
    }

    private static void matrixTest_2() throws FileNotFoundException {
        System.out.println("\t-----------Test 2 50_0.2xml------------");
        int vertexNum = 51;
        String file = "50_0.2.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 2 50_0.2xml END---------");
    }

    private static void matrixTest_3() throws FileNotFoundException {
        System.out.println("\t-----------Test 3 100_0.2xml------------");
        int vertexNum = 101;
        String file = "100_0.2.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        // System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 3 100_0.2xml END---------");
    }

    private static void matrixTest_4() throws FileNotFoundException {
        System.out.println("\t-----------Test 4 500_0.2xml------------");
        int vertexNum = 501;
        String file = "500_0.2.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 4 500_0.2xml END---------");
    }

    private static void matrixTest_5() throws FileNotFoundException {
        System.out.println("\t-----------Test 5 1000_0.2xml------------");
        int vertexNum = 1001;
        String file = "1000_0.2.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 5 1000_0.2xml END---------");
    }

    private static void matrixTest_6() throws FileNotFoundException {
        System.out.println("\t-----------Test 6 10_0.5xml------------");
        int vertexNum = 11;
        String file = "10_0.5.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 6 10_0.5xml END---------");
    }

    private static void matrixTest_7() throws FileNotFoundException {
        System.out.println("\t-----------Test 7 50_0.5xml------------");
        int vertexNum = 51;
        String file = "50_0.5.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 7 50_0.5xml END---------");
    }

    private static void matrixTest_8() throws FileNotFoundException {
        System.out.println("\t-----------Test 8 100_0.5xml------------");
        int vertexNum = 101;
        String file = "100_0.5.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 8 100_0.5xml END---------");
    }

    private static void matrixTest_9() throws FileNotFoundException {
        System.out.println("\t-----------Test 9 500_0.5xml------------");
        int vertexNum = 501;
        String file = "500_0.5.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 9 500_0.5xml END---------");
    }

    private static void matrixTest_10() throws FileNotFoundException {
        System.out.println("\t-----------Test 10 1000_0.5xml------------");
        int vertexNum = 1001;
        String file = "1000_0.5.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 10 1000_0.5xml END---------");
    }

    private static void matrixTest_11() throws FileNotFoundException {
        System.out.println("\t-----------Test 11 10_0.75xml------------");
        int vertexNum = 11;
        String file = "10_0.75.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 11 10_0.75xml END---------");
    }

    private static void matrixTest_12() throws FileNotFoundException {
        System.out.println("\t-----------Test 12 50_0.2xml------------");
        int vertexNum = 51;
        String file = "50_0.75.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 12 50_0.75xml END---------");
    }

    private static void matrixTest_13() throws FileNotFoundException {
        System.out.println("\t-----------Test 13 100_0.75xml------------");
        int vertexNum = 101;
        String file = "100_0.75.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 13 100_0.75xml END---------");
    }

    private static void matrixTest_14() throws FileNotFoundException {
        System.out.println("\t-----------Test 14 500_0.75xml------------");
        int vertexNum = 501;
        String file = "500_0.75.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 14 500_0.75xml END---------");
    }

    private static void matrixTest_15() throws FileNotFoundException {
        System.out.println("\t-----------Test 15 1000_0.75xml------------");
        int vertexNum = 1000;
        String file = "1000_0.75.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 15 1000_0.75xml END---------");
    }

    private static void matrixTest_16() throws FileNotFoundException {
        System.out.println("\t-----------Test 16 10_0.8xml------------");
        int vertexNum = 11;
        String file = "10_0.8.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 16 10_0.8xml END---------");
    }

    private static void matrixTest_17() throws FileNotFoundException {
        System.out.println("\t-----------Test 17 50_0.8xml------------");
        int vertexNum = 51;
        String file = "50_0.8.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 17 50_0.8xml END---------");
    }

    private static void matrixTest_18() throws FileNotFoundException {
        System.out.println("\t-----------Test 18 100_0.8xml------------");
        int vertexNum = 101;
        String file = "100_0.8.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 18 100_0.8xml END---------");
    }

    private static void matrixTest_19() throws FileNotFoundException {
        System.out.println("\t-----------Test 19 500_0.8xml------------");
        int vertexNum = 501;
        String file = "500_0.8.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 19 500_0.8xml END---------");
    }

    private static void matrixTest_20() throws FileNotFoundException {
        System.out.println("\t-----------Test 20 1000_0.8xml------------");
        int vertexNum = 1001;
        String file = "1000_0.8.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 20 1000_0.8xml END---------");
    }
    private static void matrixTest_21() throws FileNotFoundException {
        System.out.println("\t-----------Test 21 500_0.9xml_Unconnected------------");
        int vertexNum = 500;
        String file = "500_0.9.xml";
        MatrixGraph graph = new MatrixGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 21 500_0.9xml_Unconnected END---------");
    }

    private static void ListTest_1() throws FileNotFoundException {
        System.out.println("\t-----------Test 1 10_0.2xml------------");
        int vertexNum = 10;
        String file = "10_0.2.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        //DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 1 10_0.2xml END---------");
    }

    private static void ListTest_2() throws FileNotFoundException {
        System.out.println("\t-----------Test 2 50_0.2xml------------");
        int vertexNum = 50;
        String file = "50_0.2.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
       // DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 2 50_0.2xml END---------");
    }

    private static void ListTest_3() throws FileNotFoundException {
        System.out.println("\t-----------Test 3 100_0.2xml------------");
        int vertexNum = 100;
        String file = "100_0.2.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        // System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        //DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 3 100_0.2xml END---------");
    }

    private static void ListTest_4() throws FileNotFoundException {
        System.out.println("\t-----------Test 4 500_0.2xml------------");
        int vertexNum = 500;
        String file = "500_0.2.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        //DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 4 500_0.2xml END---------");
    }

    private static void ListTest_5() throws FileNotFoundException {
        System.out.println("\t-----------Test 5 1000_0.2xml------------");
        int vertexNum = 1002;
        String file = "1000_0.2.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        //DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 5 1000_0.2xml END---------");
    }

    private static void ListTest_6() throws FileNotFoundException {
        System.out.println("\t-----------Test 6 10_0.5xml------------");
        int vertexNum = 10;
        String file = "10_0.5.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        //DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 6 10_0.5xml END---------");
    }

    private static void ListTest_7() throws FileNotFoundException {
        System.out.println("\t-----------Test 7 50_0.5xml------------");
        int vertexNum = 51;
        String file = "50_0.5.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 7 50_0.5xml END---------");
    }

    private static void ListTest_8() throws FileNotFoundException {
        System.out.println("\t-----------Test 8 100_0.5xml------------");
        int vertexNum = 101;
        String file = "100_0.5.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 8 100_0.5xml END---------");
    }

    private static void ListTest_9() throws FileNotFoundException {
        System.out.println("\t-----------Test 9 500_0.5xml------------");
        int vertexNum = 501;
        String file = "500_0.5.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 9 500_0.5xml END---------");
    }

    private static void ListTest_10() throws FileNotFoundException {
        System.out.println("\t-----------Test 10 1000_0.5xml------------");
        int vertexNum = 1001;
        String file = "1000_0.5.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 10 1000_0.5xml END---------");
    }

    private static void ListTest_11() throws FileNotFoundException {
        System.out.println("\t-----------Test 11 10_0.75xml------------");
        int vertexNum = 11;
        String file = "10_0.75.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 11 10_0.75xml END---------");
    }

    private static void ListTest_12() throws FileNotFoundException {
        System.out.println("\t-----------Test 12 50_0.2xml------------");
        int vertexNum = 51;
        String file = "50_0.75.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 12 50_0.75xml END---------");
    }

    private static void ListTest_13() throws FileNotFoundException {
        System.out.println("\t-----------Test 13 100_0.75xml------------");
        int vertexNum = 101;
        String file = "100_0.75.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 13 100_0.75xml END---------");
    }

    private static void ListTest_14() throws FileNotFoundException {
        System.out.println("\t-----------Test 14 500_0.75xml------------");
        int vertexNum = 501;
        String file = "500_0.75.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 14 500_0.75xml END---------");
    }

    private static void ListTest_15() throws FileNotFoundException {
        System.out.println("\t-----------Test 15 1000_0.75xml------------");
        int vertexNum = 1001;
        String file = "1000_0.75.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 15 1000_0.75xml END---------");
    }

    private static void ListTest_16() throws FileNotFoundException {
        System.out.println("\t-----------Test 16 10_0.8xml------------");
        int vertexNum = 11;
        String file = "10_0.8.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 16 10_0.8xml END---------");
    }

    private static void ListTest_17() throws FileNotFoundException {
        System.out.println("\t-----------Test 17 50_0.8xml------------");
        int vertexNum = 51;
        String file = "50_0.8.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 17 50_0.8xml END---------");
    }

    private static void ListTest_18() throws FileNotFoundException {
        System.out.println("\t-----------Test 18 100_0.8xml------------");
        int vertexNum = 101;
        String file = "100_0.8.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 18 100_0.8xml END---------");
    }

    private static void ListTest_19() throws FileNotFoundException {
        System.out.println("\t-----------Test 19 500_0.8xml------------");
        int vertexNum = 501;
        String file = "500_0.8.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 19 500_0.8xml END---------");
    }

    private static void ListTest_20() throws FileNotFoundException {
        System.out.println("\t-----------Test 20 1000_0.8xml------------");
        int vertexNum = 1001;
        String file = "1000_0.8.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 20 1000_0.8xml END---------");
    }
    private static void ListTest_21() throws FileNotFoundException {
        System.out.println("\t-----------Test 21 5_0.5xml_Unconnedted------------");
        int vertexNum = 6;
        String file = "5_0.5.xml";
        ListGraph graph = new ListGraph(vertexNum, true);
        graph.loadFullGraph(file);
        //System.out.println(graph.toString());
        PrimAlgorithm_Test(graph, vertexNum);
        DijkstraAlgorithm_Test(graph, vertexNum);
        System.out.println("\t---------Test 21 5_0.5xml_Unconnedted END---------");
    }

    /**
     * Prim’s Minimum Spanning Tree algorithm.
     * @param graph The weighted graph to be searched
     * @param start The start vertex
     * @return An ArrayList of edges that forms the MST
     */
    public static ArrayList< Edge> primsAlgorithm(Graph graph,
            int start) {
        ArrayList< Edge> result = new ArrayList< Edge>();
        int numV = graph.getNumV();
        
        // Use a HashSet to represent V–S.
        Set< Integer> vMinusS = new HashSet< Integer>(numV);
        // Declare the priority queue.
        Queue< Edge> pQ
                = new PriorityQueue< Edge>(numV, new CompareEdges());
        // Initialize V–S.
        for (int i = 0; i < numV; i++) {
            if (i != start) {
                vMinusS.add(i);
            }
        }
        int current = start;
        // Main loop
        while (vMinusS.size() != 0) {
            // Update priority queue.
            Iterator< Edge> iter = graph.edgeIterator(current);
            while (iter.hasNext()) {
                Edge edge = iter.next();
                int dest = edge.getDest();
                if (vMinusS.contains(dest)) {
                    pQ.add(edge);
                }
            }
            // Find the shortest edge whose source is in S and
            // destination is in V–S.
            int dest = -1;
            Edge edge = null;
            do {
                //if(pQ.size()!=0)
                    edge = pQ.remove();
                dest = edge.getDest();
            } while (!vMinusS.contains(dest));
            // Take dest out of vMinusS.
            vMinusS.remove(dest);
            // Add edge to result.
            result.add(edge);
            current = dest;
        }
        return result;
    }

    
}
