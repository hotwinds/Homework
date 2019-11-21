package com.step.calculator;

public class Calculator {
    // умножение, деление, сложение, вычитание
    public void summ(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void dif(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void mult (int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void div (float a, float b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public void percent(double a, double b) {
        System.out.println(a + " percent from " + b + " = " + ( a * b / 100));
    }

    public void modul(double a, double b){
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
