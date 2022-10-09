package edu.du.ict_4305_grouptutorialassignmentweekfive; /**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeekFive
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/9/22
 * @author lutherchikumba
 *
 */
public class MonthTest {
      private Month<Integer> monthNumber;
      private Month<String> monthName;
      public MonthTest() {
            monthNumber = new Month<>(4);
            monthName = new Month<>("March");
      }

      @Test
      public void getMonth() {
            assertEquals(3,monthNumber.getMonth());
            assertEquals("March", monthName.getMonth());
      }

      @Test
      public void setMonth() {
            monthNumber.setMonth(12);
            monthName.setMonth("December");
            assertEquals(12,monthNumber.getMonth());
            assertEquals("December",monthName.getMonth());
      }
}