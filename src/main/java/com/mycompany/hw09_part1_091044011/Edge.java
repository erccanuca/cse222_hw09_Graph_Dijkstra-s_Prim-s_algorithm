/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw09_part1_091044011;

/**
 *
 * @author ercan
 */
public class Edge {
    
     // Data Fields
    /**
     * Source of edge
     */
    int source;
    /**
     * Destination of edge
     */
    int dest;
    /**
     * Weight of edge
     */
    double weight;
    
    /**
     * Constructor with 2 parameters 
     * @param s Source of edge
     * @param d Destination of edge
     */
    public Edge(int s, int d) {
        this.source = s;
        this.dest = d;
        this.weight = 1;
    }
    /**
     * Constructor with 3 parameters
     * @param source Source of edge
     * @param dest Destination of edge
     * @param weight Weight of edge
     */
    public Edge(int source, int dest, double weight) {
        super();
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }
    /**
     * Getter weight method
     * @return Weight of edge
     */
    public double getWeight() {
        return weight;
    }
    /**
     * Setter weight method
     * @param weight Set new weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Getter source method
     * @return Source of edge 
     */
    public int getSource() {
        return source;
    }
    /**
     * Setter source method
     * @param source Set new source
     */
    public void setSource(int source) {
        this.source = source;
    }
    /**
     * Getter destination
     * @return destination of edge
     */
    public int getDest() {
        return dest;
    }
   /**
    * Setter destination
    * @param dest set new destination 
    */
    public void setDest(int dest) {
        this.dest = dest;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.source;
        hash = 17 * hash + this.dest;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Edge other = (Edge) obj;
        if (this.source != other.source) {
            return false;
        }
        if (this.dest != other.dest) {
            return false;
        }
        return Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(other.weight);
    }

    @Override
    public String toString() {
       
        return  "\t"+(source+1) + "-->\t" + (dest+1) +"\t"+ weight;
    }
    
    
}
