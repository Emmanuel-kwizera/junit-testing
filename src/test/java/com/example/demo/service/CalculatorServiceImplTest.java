package com.example.demo.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorServiceImplTest {
    @Test
    public void sumNumber_basic(){
        CalculatorServiceImpl calcServiceImpl =  new CalculatorServiceImpl();

        int actualResult = calcServiceImpl.sumOfNumbers(new int[] {1,2,3});
        int expectedResult =6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void sumNumber_empty(){
        CalculatorServiceImpl calcServiceImpl =  new CalculatorServiceImpl();

        int actualResult = calcServiceImpl.sumOfNumbers(new int[] {});
        int expectedResult =0;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void sumNumber_oneElement(){
        CalculatorServiceImpl calcServiceImpl =  new CalculatorServiceImpl();

        int actualResult = calcServiceImpl.sumOfNumbers(new int[] {5});
        int expectedResult =5;
        assertEquals(expectedResult, actualResult);
    }
}
