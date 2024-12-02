package com.example;

import com.example.estatistc.Calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------ Calculando média ----------");
        double[] notas = { 5.5, 7.8, 9.2, 10};
        System.out.print("Notas:");
        Arrays.stream(notas).forEach(nota -> System.out.print(" "+ nota + ", "));
        System.out.println("\nMédia: " + Calculator.simpleAverage(notas));

    }
}