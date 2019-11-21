package com.step.calculator;

public class Conversion {
    public void temperatureInCelsius(double a){
        System.out.println("Temperature in Fahrenheit = " + (a*1.8+32));
    }

    public void temperatureInFahrenheit(double a){
        System.out.println("Temperature in Celsius = " + (a-32)/1.8);
    }

    public void meterInFeet(double a){
        System.out.println("Length in feet = " + a*3.2808333333465);
    }

    public void feetInMeter(double a){
        System.out.println("Length in meter = " + a*0.30480060965);
    }

    public void poundsInKg(double a){
        System.out.println("Weight in kg = " + a*0.453592);
    }

    public void kgInPounds(double a){
        System.out.println("Weight in pounds = " + a*2.2046);
    }
}
