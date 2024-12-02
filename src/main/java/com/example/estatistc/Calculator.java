package com.example.estatistc;

public class Calculator {
    public static double simpleAverage(double... values){
        double totalSum = 0;
        for (double value: values){
            totalSum += value;
        }
        return totalSum /values.length;
    }
}
