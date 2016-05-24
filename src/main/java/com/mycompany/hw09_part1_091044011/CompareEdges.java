/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.util.Comparator;

/**
 * This Class implemented Comparator interface and compare two Edges.
 * @author ercan
 */
public class CompareEdges implements Comparator<Edge> {
    /**
     * This method compare to edges.
     * @param e1 Type of Edge Class
     * @param e2 Type of Edge Class
     * @return 
     * 1 if e1.getWeight()>e2.getWeight()
     * 0 if e1.getWeight()==e2.getWeight() 
     * -1 if e1.getWeight() < e2.getWeight()
     */
    @Override
    public int compare(Edge e1, Edge e2) {
        return Double.compare(e1.getWeight(), e2.getWeight());
    }

}