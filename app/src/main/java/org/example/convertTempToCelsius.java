package org.example;

public class convertTempToCelsius implements convertTemp {
    public double convertTemp (double temperatura){
        double result = (temperatura - 32) * 0.55;
        return result;
    };
}
