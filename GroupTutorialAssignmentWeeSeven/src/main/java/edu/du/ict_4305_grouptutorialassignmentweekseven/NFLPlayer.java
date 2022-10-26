/**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeeSeven
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict_4305_grouptutorialassignmentweekseven;

/**
 *
 * @Date: 10/26/22
 * @author lutherchikumba
 *
 */
public class NFLPlayer implements Player{

      private final String name;
      private final int stats;
      private  final String sport;

      public NFLPlayer(String name, int stats, String sport) {
            this.name = name;
            this.stats = stats;
            this.sport = sport;
      }

      @Override
      public String getName() {
            return name;
      }

      @Override
      public int getStats() {
            return stats;
      }

      @Override
      public String getSport() {
            return sport;
      }
}
