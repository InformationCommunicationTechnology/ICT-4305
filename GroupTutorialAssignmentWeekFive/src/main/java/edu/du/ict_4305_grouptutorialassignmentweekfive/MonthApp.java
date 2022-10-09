/**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeekFive
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict_4305_grouptutorialassignmentweekfive;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lutherchikumba
 * @Date: 10/8/22
 */
public class MonthApp {

      public MonthApp() {

      }

      public static void main(String[] args) {
            // define arrays that can hold Month objects
            Month<Integer>[] monthNumberArray = new Month[12];  // ignore warning
            Month<String>[] monthNameArray = new Month[12];     // ignore warning
            // creating values
            Month<Integer> monthNumber = new Month<>();
            Month<String> monthName = new Month<>(); // Note: the type is inferred

//            System.out.println("Example of setting values");
//            for (int month = 1; month < monthNumberArray.length + 1; month++) {
//                  if (month == 1) {
//                        monthNumber.setMonth(month);
//                        monthName.setMonth("January");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 2) {
//                        monthNumber.setMonth(month);
//                        monthName.setMonth("February");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 3) {
//                        monthNumber.setMonth(3);
//                        monthName.setMonth("March");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 4) {
//                        monthNumber.setMonth(4);
//                        monthName.setMonth("April");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 5) {
//                        monthNumber.setMonth(5);
//                        monthName.setMonth("May");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 6) {
//                        monthNumber.setMonth(6);
//                        monthName.setMonth("June");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 7) {
//                        monthNumber.setMonth(7);
//                        monthName.setMonth("July");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 8) {
//                        monthNumber.setMonth(8);
//                        monthName.setMonth("August");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 9) {
//                        monthNumber.setMonth(9);
//                        monthName.setMonth("September");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 10) {
//                        monthNumber.setMonth(10);
//                        monthName.setMonth("October");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else if (month == 11) {
//                        monthNumber.setMonth(11);
//                        monthName.setMonth("November");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  } else {
//
//                        monthNumber.setMonth(12);
//                        monthName.setMonth("December");
//                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
//                  }
//
//            }
//            System.out.println("Example of assigning values to array elements");
//            for (int month = 0; month < monthNumberArray.length; month++) {
//                  if (month == 1) {
//                        monthNumber.setMonth(1);
//                        monthName.setMonth("January");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//
//                  } else if (month == 2) {
//                        monthNumber.setMonth(2);
//                        monthName.setMonth("February");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 3) {
//                        monthNumber.setMonth(3);
//                        monthName.setMonth("March");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 4) {
//                        monthNumber.setMonth(4);
//                        monthName.setMonth("April");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 5) {
//                        monthNumber.setMonth(5);
//                        monthName.setMonth("May");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 6) {
//                        monthNumber.setMonth(6);
//                        monthName.setMonth("June");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 7) {
//                        monthNumber.setMonth(7);
//                        monthName.setMonth("July");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 8) {
//                        monthNumber.setMonth(8);
//                        monthName.setMonth("August");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 9) {
//                        monthNumber.setMonth(9);
//                        monthName.setMonth("September");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 10) {
//                        monthNumber.setMonth(10);
//                        monthName.setMonth("October");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else if (month == 11) {
//                        monthNumber.setMonth(11);
//                        monthName.setMonth("November");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  } else {
//                        monthNumber.setMonth(12);
//                        monthName.setMonth("December");
//                        monthNumberArray[month] = monthNumber;
//                        monthNameArray[month] = monthName;
//                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
//                  }
//            }

            monthNumberArray[0] = new Month<>(1);
            monthNameArray[0] = new Month<>("January");

            monthNumberArray[1] = new Month<>(2);
            monthNameArray[1] = new Month<>("February");

            monthNumberArray[2] = new Month<>(3);
            monthNameArray[2] = new Month<>("March");

            monthNumberArray[3] = new Month<>(4);
            monthNameArray[3] = new Month<>("April");

            monthNumberArray[4] = new Month<>(5);
            monthNameArray[4] = new Month<>("May");

            monthNumberArray[5] = new Month<>(6);
            monthNameArray[5] = new Month<>("June");

            monthNumberArray[6] = new Month<>(7);
            monthNameArray[6] = new Month<>("July");

            monthNumberArray[7] = new Month<>(8);
            monthNameArray[7] = new Month<>("August");

            monthNumberArray[8] = new Month<>(9);
            monthNameArray[8] = new Month<>("September");

            monthNumberArray[9] = new Month<>(10);
            monthNameArray[9] = new Month<>("October");

            monthNumberArray[10] = new Month<>(11);
            monthNameArray[10] = new Month<>("November");

            monthNumberArray[11] = new Month<>(12);
            ;
            monthNameArray[11] = new Month<>("December");

            for (int i = 0; i < monthNumberArray.length; i++) {
                  System.out.println(monthNumberArray[i].getMonth() + " = " + monthNameArray[i].getMonth());
            }

      }
}
