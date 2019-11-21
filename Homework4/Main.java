package com.step.calculator;

public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Calculator");
        Calculator calc = new Calculator();
        calc.summ(5,4);
        calc.div(9,2);
        calc.mult(9,2);
        calc.dif(9,2);
        calc.percent(20,9);
        calc.modul(9,2);
        System.out.println();
        System.out.println("Geometry");
        Geometry geo = new Geometry();
        geo.square(5);
        geo.rectangle(3,7);
        geo.triangle(5,3,8);
        System.out.println();
        System.out.println("Conversion");
        Conversion conv = new Conversion();
        conv.temperatureInCelsius(37.7);
        conv.temperatureInFahrenheit(100);
        conv.meterInFeet(1);
        conv.feetInMeter(10);
        conv.kgInPounds(10);
        conv.poundsInKg(10);

        Game gm = new Game();
        gm.game();
    }
}
