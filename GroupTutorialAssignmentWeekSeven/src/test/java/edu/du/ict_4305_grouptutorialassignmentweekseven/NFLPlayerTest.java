package edu.du.ict_4305_grouptutorialassignmentweekseven; /**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeeSeven
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/26/22
 * @author lutherchikumba
 *
 */
public class NFLPlayerTest {
      NFLPlayer nflPlayer;
      PlayerA playerA = new PlayerA() {
            @Override
            int getStatsA() {
                  return 45;
            }

            @Override
            String getSportA() {
                  return "NFL";
            }
      };
      public NFLPlayerTest() {
            nflPlayer = new NFLPlayer("name",56,"NFA");
      }

      @Test
      public void getName() {
            assertEquals("name",nflPlayer.getName());
      }

      @Test
      public void getStats() {
            assertEquals(56,nflPlayer.getStats());
      }

      @Test
      public void getSport() {
            assertEquals("NFA",nflPlayer.getSport());
      }
      @Test
      public void getStatsA() {
            assertEquals(45,playerA.getStatsA());
      }

      @Test
      public void getSportA() {
            assertEquals("NFL",playerA.getSportA());
      }
}