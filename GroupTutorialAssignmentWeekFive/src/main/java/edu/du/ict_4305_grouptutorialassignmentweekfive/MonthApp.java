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
            // define ArrayLists that can hold Month objects
            ArrayList<Month> monthNumberArrayList = new ArrayList<>();
            ArrayList<Month> monthNameArrayList = new ArrayList<>();

            monthNumberArrayList.add(new Month(1));
            monthNameArrayList.add(new Month("January"));

            monthNumberArrayList.add(new Month(2));
            monthNameArrayList.add(new Month("February"));

            monthNumberArrayList.add(new Month(3));
            monthNameArrayList.add(new Month("March"));

            monthNumberArrayList.add(new Month(4));
            monthNameArrayList.add(new Month("April"));

            monthNumberArrayList.add(new Month(5));
            monthNameArrayList.add(new Month("May"));

            monthNumberArrayList.add(new Month(6));
            monthNameArrayList.add(new Month("June"));

            monthNumberArrayList.add(new Month(7));
            monthNameArrayList.add(new Month("July"));

            monthNumberArrayList.add(new Month(8));
            monthNameArrayList.add(new Month("August"));

            monthNumberArrayList.add(new Month(9));
            monthNameArrayList.add(new Month("September"));

            monthNumberArrayList.add(new Month(10));
            monthNameArrayList.add(new Month("October"));

            monthNumberArrayList.add(new Month(11));
            monthNameArrayList.add(new Month("November"));

            monthNumberArrayList.add(new Month(12));
            monthNameArrayList.add(new Month("December"));

            System.out.println("Example of setting values");
            for (int i = 0; i < monthNameArrayList.size(); i++) {
                  System.out.println(monthNumberArrayList.get(i).getMonth() + " = " + monthNameArrayList.get(i).getMonth());
            }

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
            monthNameArray[11] = new Month<>("December");

            System.out.println("Example of assigning values to array elements");
            for (int month = 0; month < monthNumberArray.length; month++) {
                  System.out.println(monthNumberArray[month].getMonth() + " = " + monthNameArray[month].getMonth());
            }

      }
}
