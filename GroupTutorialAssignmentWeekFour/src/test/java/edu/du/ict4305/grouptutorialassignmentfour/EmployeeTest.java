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
public class EmployeeTest {

    private String name;
    private double salary;
    private double percentSalary;
    private boolean isNameEmpty;
    private boolean isSalaryValid;
    private Employee emp;

    public EmployeeTest() {
        name = "luther";
        salary = 400.0;
        percentSalary = 0.0;
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        emp = new Employee(name, salary);
        assertEquals(name, emp.getName());
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        emp = new Employee(name, salary);
        assertEquals(salary, emp.getSalary());
    }

    /**
     * Test of raiseSalary method, of class Employee.
     */
    @Test
    public void testRaiseSalary() {
        emp = new Employee(name, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            emp.raiseSalary(0);
        });

    }

    /**
     * Test of isNameEmpty method, of class Employee.
     */
    @Test
    public void testIsNameEmpty() {
        emp = new Employee(name, salary);
        assertFalse(emp.isNameEmpty());
        if (emp.isNameEmpty() == true) {
            assertThrows(IllegalArgumentException.class, () -> {
                emp.isNameEmpty();
            });
        }

    }

    /**
     * Test of isSalaryEmpty method, of class Employee.
     */
    @Test
    public void testIsSalaryValid() {
        emp = new Employee(name, salary);
        assertFalse(emp.isSalaryValid());
        if (emp.isSalaryValid() == true) {
            assertThrows(IllegalArgumentException.class, () -> {
                emp.isSalaryValid();
            });
        }

    }

}
