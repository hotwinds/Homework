package com.matricon.homework4;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Geometry {
    public int areaOfSquare(int a){
        return a * a;
//        System.out.println("Area of square = " + (a * a));
//        System.out.println("Perimeter of square = " + (2 * a + 2 * a));
    }
    public int perimeterOfSquare(int a) {
        return 2 * a + 2 * a;
    }

    public int areaOfRectangle(int a, int b){
        return a * b;
//        System.out.println("Area of rectangle = " + (a * b));
//        System.out.println("Perimeter of rectangle = " + (2 * a + 2 * b));
    }

    public int perimeterOfRectangle(int a, int b){
        return 2 * a + 2 * b;
    }

    public double areaOfTriangle(double a, double b, double c){
        return  (a + b + c)/2;
//        System.out.println("Area of triangle = " + s);
//        System.out.println("Perimeter of triangle = " + (a + b + c));
    }

    public double perimeterOfTriangle(double a, double b, double c){
        return Math.sqrt((a + b + c)/2 * ((a + b + c)/2 - a) * ((a + b + c)/2 - b) * ((a + b + c)/2 - c));
//        System.out.println("Area of triangle = " + s);
//        System.out.println("Perimeter of triangle = " + (a + b + c));
    }
}
