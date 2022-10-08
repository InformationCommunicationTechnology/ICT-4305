/**
 *
 * @Course: ICT 4305
 * @File:
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.grouptutorialassignmentfour;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date:
 * @author lutherchikumba
 *
 */
public class EmployeeTwoTest {

    private Employee employee;

    public EmployeeTwoTest() {
        employee = new Employee("luther", 40);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        assertEquals("luther", employee.getName());
    }

    /**
     * Test of isNameEmpty method, of class Employee.
     */
    @Test
    public void testIsNameEmpty() {
        assertFalse(employee.isNameEmpty());
    }

    @Test
    public void testnameIsEmpty() {
        employee = new Employee("", 40);
        assertThrows(IllegalArgumentException.class, () -> {
            employee.isNameEmpty();
        });

    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        assertEquals(40, employee.getSalary());
    }

    /**
     * Test of isSalaryValid method, of class Employee.
     */
    @Test
    public void testIsSalaryValid() {
        employee = new Employee("luther", 0);
        assertThrows(IllegalArgumentException.class, () -> {
            employee.isSalaryValid();
        });
    }

    /**
     * Test of isSalaryValid method, of class Employee.
     */
    @Test
    public void testSalaryisValid() {
        employee = new Employee("luther", 40);
        assertTrue(employee.isSalaryValid());
    }

    /**
     * Test of raiseSalary method, of class Employee.
     */
    @Test
    public void testRaiseSalary() {
            assertThrows(IllegalArgumentException.class, () -> {
            employee.raiseSalary(0);
        });
    }  

}
