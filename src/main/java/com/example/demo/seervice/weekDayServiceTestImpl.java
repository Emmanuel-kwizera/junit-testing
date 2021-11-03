package com.example.demo.seervice;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class weekDayServiceTestImpl {
    @Test
    public void getDayOfWeek_notADay() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(0);
        String expectedResult= "NotADay";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getDayOfWeek_monday() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(1);
        String expectedResult= "Monday";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getDayOfWeek_tuesday() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(2);
        String expectedResult= "Tuesday";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getDayOfWeek_wednesday() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(3);
        String expectedResult= "Wednesday";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getDayOfWeek_thursday() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(4);
        String expectedResult= "Thursday";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getDayOfWeek_friday() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(5);
        String expectedResult= "Friday";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getDayOfWeek_saturday() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(6);
        String expectedResult= "Saturday";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getDayOfWeek_sunday() {
        weekDayServiceImpl weekDayService = new weekDayServiceImpl();
        String actualResult = weekDayService.getDayOfWeek(7);
        String expectedResult= "Sunday";
        assertEquals(expectedResult,actualResult);
    }
}
