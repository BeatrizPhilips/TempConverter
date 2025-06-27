package org.example;

public class convertTempToCelsius implements convertTemp {
    public double convertTemp (double temperatura){
        double result = (temperatura - 32) * 5.0 / 9.0;
        return result;
    };
}
