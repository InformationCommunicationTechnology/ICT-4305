/**
 *
 * @Course: ICT 4305
 * @File:
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.mycalender.grouptutorialassignmentweekthree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * 
 * @Date:  9/27/2022
 * @author lutherchikumba
 *
 */
public class MyDateTest {
    private MyDate date;

     public MyDateTest() {
    }

    /**
     * Test of getDay method, of class MyDate.
     */
    @Test
    public void testGetDay() {
        date = new MyDate(1, 2, 2000);
        assertEquals(1, date.getDay());
    }

    /**
     * Test of getMonth method, of class MyDate.
     */
    @Test
    public void testGetMonth() {
        date = new MyDate(1, 2, 2000);
        assertEquals(2, date.getMonth());        
    }

    /**
     * Test of getYear method, of class MyDate.
     */
    @Test
    public void testGetYear() {
        date = new MyDate(1, 2, 2000);
        assertEquals(2000, date.getYear());        
    }

    /**
     * Test of isLeapYear method, of class MyDate.
     */
    @Test
    public void testIsLeapYear() {
        assertTrue(MyDate.isLeapYear(2000));
    }

    /**
     * Test of getLastDayOfMonth method, of class MyDate.
     */
    @Test
    public void testGetLastDayOfMonth() {
        assertEquals(28,MyDate.getLastDayOfMonth(2, 2000));
    }

    /**
     * Test of isValidDay method, of class MyDate.
     */
    @Test
    public void testIsValidDay() {
    }

}