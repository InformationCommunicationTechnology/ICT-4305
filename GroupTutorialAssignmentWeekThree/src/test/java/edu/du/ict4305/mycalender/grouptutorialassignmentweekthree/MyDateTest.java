/**
 *
 * @Course: ICT 4305
 * @File: MyDateTest.java
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.mycalender.grouptutorialassignmentweekthree;

import java.util.ArrayList;
import java.util.Random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 9/27/2022
 * @author lutherchikumba
 *
 */
public class MyDateTest {

    private MyDate date;
    private final Random getRandomDay = new Random();
    private final Random getRandomMonth = new Random();
    private final Random getRandomYear = new Random();
    private ArrayList<Integer> leapYearList;
    private int day;
    private int month;
    private int year;

    public MyDateTest() {
    }

    /**
     * Test of getDay method, of class MyDate.
     */
    @Test
    public void testGetDay() {
        for (int i = 0; i < 1000; i++) {
            day = getRandomDay.nextInt(31) + 1;
            month = getRandomMonth.nextInt(12) + 1;
            year = getRandomYear.nextInt(2022) + 1;
            date = new MyDate(day, month, year);
            assertEquals(day, date.getDay());
        }

    }

    /**
     * Test of getMonth method, of class MyDate.
     */
    @Test
    public void testGetMonth() {
        for (int i = 0; i < 1000; i++) {
            day = getRandomDay.nextInt(31) + 1;
            month = getRandomMonth.nextInt(12) + 1;
            year = getRandomYear.nextInt(2022) + 1;
            System.out.println("The rand month is " + month);
            date = new MyDate(day, month, year);
            assertEquals(month, date.getMonth());
        }

    }

    /**
     * Test of getYear method, of class MyDate.
     */
    @Test
    public void testGetYear() {
        for (int i = 0; i < 1000; i++) {
            day = getRandomDay.nextInt(31) + 1;
            month = getRandomMonth.nextInt(12) + 1;
            year = getRandomYear.nextInt(2022) + 1;
            System.out.println("The rand month is " + year);
            date = new MyDate(day, month, year);
            assertEquals(year, date.getYear());
        }
    }

    /**
     * Test of isLeapYear method, of class MyDate.
     */
    @Test
    public void testIsLeapYear() {
        leapYearList = new ArrayList<>();
        leapYearList.add(2000);
        leapYearList.add(1988);
        leapYearList.add(1992);
        leapYearList.add(2004);
        leapYearList.add(2024);
        for (int i = 0; i < leapYearList.size(); i++) {
            assertTrue(MyDate.isLeapYear(leapYearList.get(i)));
        }
    }

    /**
     * Test of getLastDayOfMonth method, of class MyDate.
     */
    @Test
    public void testGetLastDayOfMonth() {

        for (int i = 0; i < 1000; i++) {
            day = getRandomDay.nextInt(31) + 1;
            month = getRandomMonth.nextInt(12) + 1;
            year = getRandomYear.nextInt(2022) + 1;
            if (month == 1) {
                assertEquals(31, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 2 && date.isLeapYear(year) == true) {
                assertEquals(29, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 3) {
                assertEquals(31, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 4) {
                assertEquals(30, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 5) {
                assertEquals(31, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 6) {
                assertEquals(30, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 7) {
                assertEquals(31, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 8) {
                assertEquals(31, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 9) {
                assertEquals(30, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 10) {
                assertEquals(30, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 11) {
                assertEquals(30, MyDate.getLastDayOfMonth(month, year));
            } else if (month == 12) {
                assertEquals(31, MyDate.getLastDayOfMonth(month, year));
            } else {
                assertThrows(IllegalArgumentException.class, () -> {
                MyDate.getLastDayOfMonth(45, year);
            });
            }

        }
    }

    /**
     * Test of isDayValid method, of class MyDate.
     */
    @Test
    public void testIsDayValid() {
        for (int i = 0; i < 1000; i++) {
            month = getRandomMonth.nextInt(12) + 1;
            if (month == 1) {
                day = getRandomDay.nextInt(31) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 2) {
                day = getRandomDay.nextInt(29) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 3) {
                day = getRandomDay.nextInt(31) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 4) {
                day = getRandomDay.nextInt(30) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 5) {
                day = getRandomDay.nextInt(31) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 6) {
                day = getRandomDay.nextInt(30) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 7) {
                day = getRandomDay.nextInt(31) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 8) {
                day = getRandomDay.nextInt(31) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 9) {
                day = getRandomDay.nextInt(30) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 10) {
                day = getRandomDay.nextInt(30) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 11) {
                day = getRandomDay.nextInt(30) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else if (month == 12) {
                day = getRandomDay.nextInt(31) + 1;
                assertTrue(MyDate.isDayValid(month, day));
            } else {
                assertThrows(IllegalArgumentException.class, () -> {
                    MyDate.isMonthValid(month);
                });
            }
        }
    }

    /**
     * Test of isMonthValid method, of class MyDate.
     */
    @Test
    public void testIsMonthValid() {
        day = getRandomDay.nextInt(31) + 1;
        month = getRandomMonth.nextInt(12) + 1;
        year = getRandomYear.nextInt(2022) + 1;
        if (month <= 12) {
            assertTrue(MyDate.isMonthValid(month));
        } else {
            assertThrows(IllegalArgumentException.class, () -> {
                MyDate.isDayValid(month, day);
            });
        }
    }

    /**
     * Test of julianNumber method, of class MyDate.
     */
    @Test
    public void testJulianNumber() {
    }

}
