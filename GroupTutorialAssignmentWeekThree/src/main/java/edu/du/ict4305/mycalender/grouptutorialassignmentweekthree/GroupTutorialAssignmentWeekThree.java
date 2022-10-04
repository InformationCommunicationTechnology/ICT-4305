/**
 *
 * @Course: ICT 4305
 * @File: GroupTutorialAssignmentWeekThree.java
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.mycalender.grouptutorialassignmentweekthree;

import java.util.Scanner;

/**
 *
 * @Date: 9/26/2022
 * @author lutherchikumba
 *
 */
public class GroupTutorialAssignmentWeekThree {

    private static MyDate date;
    private static MyDate defaultDate;
    private static int getLastDayOfMonth;
    private static boolean isLeapYear;
    private static boolean isDayValid;
    private static boolean isMonthValid;
    private static int initDay;
    private static int initMonth;
    private static int initYear;
    private static Scanner day;
    private static Scanner month;
    private static Scanner year;

    public static void main(String[] args) {
        day = new Scanner(System.in);
        month = new Scanner(System.in);
        year = new Scanner(System.in);
        System.out.println("Enter day...");
        initDay = day.nextInt();
        System.out.println("Enter month...");
        initMonth = month.nextInt();
        System.out.println("Enter year...");
        initYear = year.nextInt();

        defaultDate = new MyDate();
        date = new MyDate(initDay, initMonth, initYear);

        // Check if the day is valid
        try {
            isDayValid = MyDate.isDayValid(initDay, initMonth);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        // Check if the month is valid        
        try {
            isMonthValid = MyDate.isMonthValid(initMonth);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        if (isMonthValid == true && isDayValid == true) {
            date.julianNumber();
        }

        // Check the last day of the month  
        try {
            getLastDayOfMonth = MyDate.getLastDayOfMonth(initMonth, initYear);
            System.out.println("The last day of the month is : " + getLastDayOfMonth);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        isLeapYear = MyDate.isLeapYear(initYear);
        if (isLeapYear == true) {
            System.out.println("It's leap year for sure!!");
        } else {
            System.out.println("It's not leap year!!");
        }

    }
}
