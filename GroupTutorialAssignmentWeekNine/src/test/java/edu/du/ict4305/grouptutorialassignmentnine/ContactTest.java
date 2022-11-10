package edu.du.ict4305.grouptutorialassignmentnine; /**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeekNine
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 11/10/22
 * @author lutherchikumba
 *
 */
public class ContactTest {

      Contact contact = new Contact();
      public ContactTest() {

      }

      @Test
      public void testIsValidPhoneNo() {
            assertTrue(contact.isValidPhoneNo("9999999999"));
            assertFalse(contact.isValidPhoneNo("999999999"));
      }

      @Test
      public void testIsValidEmailAddress() {
            assertTrue(contact.isValidEmailAddress("luther@gmail.com"));
            assertFalse(contact.isValidEmailAddress("luthergmail.com"));
      }
}