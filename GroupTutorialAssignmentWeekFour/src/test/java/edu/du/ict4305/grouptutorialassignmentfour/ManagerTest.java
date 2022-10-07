/**
 * @Course: ICT 4305
 * @File:
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.grouptutorialassignmentfour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/01/2022
 * @author lutherchikumba
 *
 */
public class ManagerTest {

      public ManagerTest() {
      }

      /**
       * Test of raiseSalary method, of class Manager.
       */
      @Test
      public void testRaiseSalary() {
          Manager manager = new Manager("luther", 50);
            assertThrows(IllegalArgumentException.class, () -> {
            manager.raiseSalary(0);
        });
      }

}