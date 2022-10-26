/**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeeSeven
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict_4305_grouptutorialassignmentweekseven;

/**
 * @author lutherchikumba
 * @Date: 10/26/22
 */
abstract class PlayerA {

      public String name;
      public int stats;
      public String sport;

      public String getNameA() {
            return name;
      }

      abstract int getStatsA();

      abstract String getSportA();
}
