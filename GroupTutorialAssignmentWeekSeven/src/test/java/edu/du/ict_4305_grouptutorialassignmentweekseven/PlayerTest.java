package edu.du.ict_4305_grouptutorialassignmentweekseven; /**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeekSeven
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lutherchikumba
 * @Date: 10/29/22
 */
public class PlayerTest {

      Player player = new Player() {
            @Override
            public String getName() {
                  return "Larry Bird";
            }

            @Override
            public int getStats() {
                  return 0;
            }

            @Override
            public String getSport() {
                  return "basketball";
            }
      };

      public PlayerTest() {

      }

      @Test
      public void getName() {
            assertEquals("Larry Bird", player.getName());
      }

      @Test
      public void getStats() {
            assertEquals(0, player.getStats());
      }

      @Test
      public void getSport() {
            assertEquals("basketball", player.getSport());
      }
}