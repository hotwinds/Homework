package com.matricon.homework4;

public class Main {
    public static void main(String[] args){
        System.out.println();

        System.out.println("Calculator");
        Calculator calc = new Calculator();
        int a = 5, b = 4;
        int summ = calc.summ(a,b);
        System.out.println(a + " + " + b + " = " + summ);
        float div = calc.div(9,2);
        System.out.println(9 + " / " + 2 + " = " + div);
        int mult = calc.mult(9,2);
        System.out.println(9 + " * " + 2 + " = " + mult);
        int dif = calc.dif(9,2);
        System.out.println(9 + " - " + 2 + " = " + dif);
        double per = calc.percent(20,9);
        System.out.println(20 + " percent from " + 9 + " = " + per);
        double mod = calc.modul(9,2);
        System.out.println(9 + " % " + 2 + " = " + mod);
        System.out.println();

        System.out.println("Geometry");
        Geometry geo = new Geometry();
        int as = geo.areaOfSquare(5);
        int ps = geo.perimeterOfSquare(5);
        System.out.println("Area of square = " + as);
        System.out.println("Perimeter of square = " + ps);
        int ar = geo.areaOfRectangle(3,7);
        int pr = geo.perimeterOfRectangle(3, 7);
        System.out.println("Area of rectangle = " + ar);
        System.out.println("Perimeter of rectangle = " + pr);
        double at = geo.areaOfTriangle(5,3,8);
        double pt = geo.perimeterOfTriangle(5,3,8);
        System.out.println("Area of triangle = " + at);
        System.out.println("Perimeter of triangle = " + pt);
        System.out.println();

        System.out.println("Conversion");
        Converter conv = new Converter();
        double celToFar = conv.convertToFarenheit(37.7);
        System.out.println("Temperature in Fahrenheit = " + celToFar);
        double farToCel = conv.convertToCelcius(100);
        System.out.println("Temperature in Celsius = " + farToCel);
        double meterToFeet = conv.convertMeterInFeet(1);
        System.out.println("Length in feet = " + meterToFeet);
        double feetToMeter = conv.convertFeetInMeter(10);
        System.out.println("Length in meter = " + feetToMeter);
        double kgInPounds = conv.convertKgInPounds(10);
        System.out.println("Weight in kg = " + kgInPounds);
        double poundsInKg = conv.convertPoundsInKg(10);
        System.out.println("Weight in pounds = " + poundsInKg);

        Game gm = new Game();
        gm.game();
    }
}