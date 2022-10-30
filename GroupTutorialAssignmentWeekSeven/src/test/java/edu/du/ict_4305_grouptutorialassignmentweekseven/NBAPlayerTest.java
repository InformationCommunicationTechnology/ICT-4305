package edu.du.ict_4305_grouptutorialassignmentweekseven; /**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeeSeven
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lutherchikumba
 * @Date: 10/26/22
 */
public class NBAPlayerTest {
      NBAPlayer nbaPlayer;
      PlayerA playerA = new PlayerA() {
            @Override
            int getStatsA() {
                  return 57;
            }

            @Override
            String getSportA() {
                  return "NBA";
            }
      };

      public NBAPlayerTest() {
            nbaPlayer = new NBAPlayer("name", 56, "NBA");
      }

      @Test
      public void getName() {
            assertEquals("name", nbaPlayer.getName());
      }

      @Test
      public void getStats() {
            assertEquals(56, nbaPlayer.getStats());
      }

      @Test
      public void getSport() {
            assertEquals("NBA", nbaPlayer.getSport());
      }

      @Test
      public void getStatsA() {
            assertEquals(57, playerA.getStatsA());
      }

      @Test
      public void getSportA() {
            assertEquals("NBA", playerA.getSportA());
      }
}