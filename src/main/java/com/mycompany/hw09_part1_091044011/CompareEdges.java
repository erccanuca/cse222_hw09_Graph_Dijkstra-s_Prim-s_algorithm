/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

import java.util.Comparator;

/**
 *
 * @author ercan
 */
public class CompareEdges implements Comparator<Edge> {

    @Override
    public int compare(Edge e1, Edge e2) {
        return Double.compare(e1.getWeight(), e2.getWeight());
    }

}