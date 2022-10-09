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
public class Month<T> {
      private T month;

      // constructors
      public Month() {

      }

      /**
       * @param month
       */
      public Month(T month) {
            this.month = month;
      }

      /**
       * @return
       */
      public T getMonth() {
            return month;
      }

      /**
       * @param month
       */
      public void setMonth(T month) {
            this.month = month;
      }
}
