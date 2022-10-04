/**
 *
 * @Course: ICT 4305
 * @File:
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.grouptutorialassignmentfour;

/**
 *
 * @Date:
 * @author lutherchikumba
 *
 */
public class Employee {

    private final String name;
    private final double salary;
    double newSalary;
    private double calcSalary;

    /**
     *
     * @param name
     * @param salary
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public boolean isNameEmpty() {
        if (getName() == null || getName().isEmpty()) {
            throw new IllegalArgumentException("Name is empty!");
        } else {
            return false;
        }

    }

    /**
     *
     * @return
     */
    public double getSalary() {
        return salary;
    }

    public boolean isSalaryValid() {
        if (getSalary() <= 0) {
            throw new IllegalArgumentException("Please enter a valid salary");
        } else {
            return true;
        }
    }

    /**
     *
     * @param byPercent
     */
    public void raiseSalary(double byPercent) {
        if (byPercent <= 0 || isSalaryValid() == false) {
            throw new IllegalArgumentException("Please enter a valid percent salary");
        } else {
            calcSalary = getSalary() * byPercent;
            newSalary = calcSalary + getSalary();
            System.out.println("Your new salary is " + newSalary);
        }
    }

}
