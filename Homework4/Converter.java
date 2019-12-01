package com.matricon.homework4;

public class Converter {
    public double convertToFarenheit(double a){
        return a*1.8+32;
//        System.out.println("Temperature in Fahrenheit = " + (a*1.8+32));
    }

    public double convertToCelcius(double a){
        return (a-32)/1.8;
//        System.out.println("Temperature in Celsius = " + (a-32)/1.8);
    }

    public double convertMeterInFeet(double a){
        return a*3.2808333333465;
//        System.out.println("Length in feet = " + a*3.2808333333465);
    }

    public double convertFeetInMeter(double a){
        return a*0.30480060965;
//        System.out.println("Length in meter = " + a*0.30480060965);
    }

    public double convertPoundsInKg(double a){
        return a*0.453592;
//        System.out.println("Weight in kg = " + a*0.453592);
    }

    public double convertKgInPounds(double a){
        return a*2.2046;
//        System.out.println("Weight in pounds = " + a*2.2046);
    }
}
