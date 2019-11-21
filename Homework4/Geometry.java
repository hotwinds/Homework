package com.step.calculator;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Geometry {
    public void square(int a){
        System.out.println("Area of square = " + (a * a));
        System.out.println("Perimeter of square = " + (2 * a + 2 * a));
    }

    public void rectangle(int a, int b){
        System.out.println("Area of rectangle = " + (a * b));
        System.out.println("Perimeter of rectangle = " + (2 * a + 2 * b));
    }

    public void triangle(double a, double b, double c){
        double p = (a + b + c)/2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area of triangle = " + s);
        System.out.println("Perimeter of triangle = " + (a + b + c));
    }
}
