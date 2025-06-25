package org.example;

public class convertTempToFahrenheit implements convertTemp {
    public double convertTemp (double temperatura){
        double result = (temperatura * 1.8) + 32;
        return result;
    };
}
