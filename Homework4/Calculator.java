package com.matricon.homework4;

public class Calculator {
    // умножение, деление, сложение, вычитание
    public int summ(int a, int b){
        return a + b;
//        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public int dif(int a, int b) {
        return a - b;
//        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public int mult (int a, int b) {
        return a * b;
//        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public float div (float a, float b) {
        return a / b;
//        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public double percent(double a, double b) {
        return a * b / 100;
//        System.out.println(a + " percent from " + b + " = " + ( a * b / 100));
    }

    public double modul(double a, double b){
        return a % b;
//        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
