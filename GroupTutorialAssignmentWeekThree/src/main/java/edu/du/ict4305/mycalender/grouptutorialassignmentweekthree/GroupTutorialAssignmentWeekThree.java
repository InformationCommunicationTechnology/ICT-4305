/**
 *
 * @Course: ICT 4305
 * @File:
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
    private static MyDate existingDate;
    private static int getDay;
    private static int getMonth;
    private static int getYear;
    private static int getLastDayOfMonth;
    private static boolean isLeapYear;
    private static boolean isValidDay;
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
        existingDate = new MyDate(defaultDate);
        date = new MyDate(initDay, initMonth, initYear);

        getDay = date.getDay();
        getYear = date.getYear();
        try {
            getMonth = date.getMonth();
            getLastDayOfMonth = MyDate.getLastDayOfMonth(initMonth, initYear);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("The last day of the month is " + getLastDayOfMonth);

        isLeapYear = MyDate.isLeapYear(initYear);
        if (isLeapYear == true) {
            System.out.println("It's leap year for sure!!");
        } else {
            System.out.println("It's not leap year!!");
        }

        try {
            getMonth = date.getMonth();
            isValidDay = MyDate.isValidDay(initMonth, initDay);
            if (isValidDay == true) {
                System.out.println("The day is valid");
            } else {
                System.out.println("Please enter a valid day");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
