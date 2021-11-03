package com.example.demo.service;

//import org.testng.annotations.Test;

public class CalculatorServiceImpl {
    public int sumOfNumbers(int[] data) {
        int sum = 0;

        for(int value:data) {
            sum += value;
        }
        return sum;
    }
}
