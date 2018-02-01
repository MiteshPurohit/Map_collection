/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import java.util.Map;


/**
 *
 * @author Hardik
 */
public class Triangle {

    private Map<Integer, Integer> a;
    private Map<String, Point> points;

    public Map<Integer, Integer> getA() {
        return a;
    }

    public void setA(Map<Integer, Integer> a) {
        this.a = a;
    }

    public Map<String, Point> getPoints() {
        return points;
    }

    public void setPoints(Map<String, Point> points) {
        this.points = points;
    }

    public void display() {

        for (Integer key : getA().values()) {

            System.out.println("A -(key,value) = A -(" + key + "," + getA().get(key) + ")");
        }

        for (String key : getPoints().keySet()) {

            System.out.println("Points -(key,value) = Points -(" + key + ",[" + getPoints().get(key).getX() + "," + getPoints().get(key).getY() + "])");

        }

    }
}
