/**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeekFive
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict_4305_grouptutorialassignmentweekfive;


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

            System.out.println("Example of setting values");
            for (int month = 1; month < monthNumberArray.length+1; month++) {
                  if (month == 1) {
                        monthNumber.setMonth(month);
                        monthName.setMonth("January");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 2) {
                        monthNumber.setMonth(month);
                        monthName.setMonth("February");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 3) {
                        monthNumber.setMonth(3);
                        monthName.setMonth("March");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 4) {
                        monthNumber.setMonth(4);
                        monthName.setMonth("April");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 5) {
                        monthNumber.setMonth(5);
                        monthName.setMonth("May");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 6) {
                        monthNumber.setMonth(6);
                        monthName.setMonth("June");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 7) {
                        monthNumber.setMonth(7);
                        monthName.setMonth("July");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 8) {
                        monthNumber.setMonth(8);
                        monthName.setMonth("August");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 9) {
                        monthNumber.setMonth(9);
                        monthName.setMonth("September");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 10) {
                        monthNumber.setMonth(10);
                        monthName.setMonth("October");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else if (month == 11) {
                        monthNumber.setMonth(11);
                        monthName.setMonth("November");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  } else {

                        monthNumber.setMonth(12);
                        monthName.setMonth("December");
                        System.out.println(monthNumber.getMonth() + " = " + monthName.getMonth());
                  }

            }

            System.out.println("Example of assigning values to array elements");
            for ( int month = 0; month < monthNumberArray.length; month++) {
                  if (month == 1) {
                        monthNumber.setMonth(1);
                        monthName.setMonth("January");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());

                  } else if (month == 2) {
                        monthNumber.setMonth(2);
                        monthName.setMonth("February");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 3) {
                        monthNumber.setMonth(3);
                        monthName.setMonth("March");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 4) {
                        monthNumber.setMonth(4);
                        monthName.setMonth("April");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 5) {
                        monthNumber.setMonth(5);
                        monthName.setMonth("May");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 6) {
                        monthNumber.setMonth(6);
                        monthName.setMonth("June");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 7) {
                        monthNumber.setMonth(7);
                        monthName.setMonth("July");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 8) {
                        monthNumber.setMonth(8);
                        monthName.setMonth("August");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 9) {
                        monthNumber.setMonth(9);
                        monthName.setMonth("September");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 10) {
                        monthNumber.setMonth(10);
                        monthName.setMonth("October");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else if (month == 11) {
                        monthNumber.setMonth(11);
                        monthName.setMonth("November");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  } else {
                        monthNumber.setMonth(12);
                        monthName.setMonth("December");
                        monthNumberArray[month] = monthNumber;
                        monthNameArray[month] = monthName;
                        System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
                  }
            }
      }
}
