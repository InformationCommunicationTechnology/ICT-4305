/**
 *
 * @Course: ICT 4305
 * @File:
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.mycalender.grouptutorialassignmentweekthree;

/**
 *
 * @Date: 9/26/2022
 * @author lutherchikumba
 *
 */
public class MyDate {

    /* This private data member holds the calculated Julian number for this MyDate */
    private static int julianNumber;
    private int initday;
    private int date;
    private int initmonth;
    private int inityear;
    private static Integer iYear;
    private static boolean isLeapYear;
    private static boolean isValidDay;
    private static int lastDayOfMonth;
    private static int[] jNumber;
    private static int l;
    private static int n;
    private static int i;
    private static int j;

    /**
     * If no arguments were provided then default the date January 1st, 1970
     * (epoch time).
     */
    public MyDate() {
        date = 111970;
    }

    /**
     * Creates a new MyDate from an existing MyDate
     *
     * @param date
     */
    public MyDate(MyDate date) {
        date = new MyDate();

    }

    /**
     *
     * Creates a new MyDate from a day, month, and year
     *
     * @param day
     * @param month
     * @param year
     */
    public MyDate(int day, int month, int year) {
        initday = day;
        initmonth = month;
        inityear = year;
        julianNumber = toJulianNumber(day, month, year);
        System.out.println("Julian Number is " + julianNumber);
        jNumber = fromJulianNumber(julianNumber);
        System.out.print("The date is ");
        for (date = 0; date < jNumber.length; date++) {
            System.out.print("/" + jNumber[date]);
        }
        System.out.println();
    }

    /**
     *
     * Returns the day of the month for this MyDate
     *
     * @return
     */
    public int getDay() {
        return initday;
    }

    /**
     *
     * Returns the month of the year for this MyDate
     *
     * @return
     */
    public int getMonth() {
        if (12 <= initmonth && initmonth > 0) {
            throw new IllegalArgumentException("Month is not valid!");
        }
        return initmonth;
    }

    /**
     *
     * Returns the year for this MyDate
     *
     * @return
     */
    public int getYear() {
        return inityear;
    }

    /**
     *
     * Returns true if this MyDate represents a date in a leap year
     *
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        iYear = year;
        if (!(iYear.toString().endsWith("00")) == true && year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = year % 400 == 0 && year % 100 == 0;
        }
        return isLeapYear;
    }

    /**
     *
     * @param month
     * @param year
     * @return
     */
    public static int getLastDayOfMonth(int month, int year) {
        iYear = year;
        if (month == 1) {
            lastDayOfMonth = 31;
        } else if (2 == month && (!(iYear.toString().endsWith("00")) == true && year % 4 == 0)) {
            lastDayOfMonth = 29;
        }else if (2 == month && (year % 400 == 0 && year % 100 == 0)){
            lastDayOfMonth = 29;
        }else if (2 == month && (year % 100 == 0)){
            lastDayOfMonth = 28;
        }else if (month == 3) {
            lastDayOfMonth = 31;
        } else if (month == 4) {
            lastDayOfMonth = 30;
        } else if (month == 5) {
            lastDayOfMonth = 31;
        } else if (month == 6) {
            lastDayOfMonth = 30;
        } else if (month == 7) {
            lastDayOfMonth = 31;
        } else if (month == 8) {
            lastDayOfMonth = 31;
        } else if (month == 9) {
            lastDayOfMonth = 30;
        } else if (month == 10) {
            lastDayOfMonth = 30;
        } else if (month == 11) {
            lastDayOfMonth = 30;
        } else if (month == 12) {
            lastDayOfMonth = 31;
        } else {
            throw new IllegalArgumentException("Month is not valid!");
        }
        return lastDayOfMonth;
    }

    /**
     *
     * @param month
     * @param day
     * @return
     */
    public static boolean isValidDay(int month, int day) {
        if (month == 1 && day <= 31 && day > 0) {
            isValidDay = true;
        } else if (month == 2 && day <= 29 && day > 0) {
            isValidDay = true;
        } else if (month == 3 && day <= 31 && day > 0) {
            isValidDay = true;
        } else if (month == 4 && day <= 30 && day > 0) {
            isValidDay = true;
        } else if (month == 5 && day <= 31 && day > 0) {
            isValidDay = true;
        } else if (month == 6 && day <= 30 && day > 0) {
            isValidDay = true;
        } else if (month == 7 && day <= 31 && day > 0) {
            isValidDay = true;
        } else if (month == 8 && day <= 31 && day > 0) {
            isValidDay = true;
        } else if (month == 9 && day <= 30 && day > 0) {
            isValidDay = true;
        } else if (month == 10 && day <= 30 && day > 0) {
            isValidDay = true;
        } else if (month == 11 && day <= 30 && day > 0) {
            isValidDay = true;
        } else if (month == 12 && day <= 31 && day > 0) {
            isValidDay = true;
        } else {
            throw new IllegalArgumentException("Day is not valid!");
        }
        return isValidDay;
    }

    /* This internal method returns the calculated Julian number for the provided day, month, year
     * This method is static, as it does not require a MyDate object to perform its computation
     */
    private static int toJulianNumber(int day, int month, int year) {
        julianNumber = (1461 * (year + 4800 + (month - 14) / 12)) / 4 + (367 * (month - 2 - 12 * ((month - 14) / 12))) / 12 - (3 * ((year + 4900 + (month - 14) / 12) / 100)) / 4 + day - 32075;
        return julianNumber;
    }

    /* This internal method returns a 3-integer array 
     * containing the day, month, and year of this MyDate
     */
    private int[] fromJulianNumber(int julianNumber) {
        l = julianNumber + 68569;
        n = (4 * l) / 146097;
        l = l - (146097 * n + 3) / 4;
        i = (4000 * (l + 1)) / 1461001;
        l = l - (1461 * i) / 4 + 31;
        j = (80 * l) / 2447;
        initday = l - (2447 * j) / 80;
        l = j / 11;
        initmonth = j + 2 - (12 * l);
        inityear = 100 * (n - 49) + i + l;
        int[] sample = {initday, initmonth, inityear};
        return sample;
    }

}
