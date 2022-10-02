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
public class Manager extends Employee {

    private double calcManagerSalary;
    private double newManagerSalary;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    /**
     *
     * @param byPercent
     */
    @Override
    public void raiseSalary(double byPercent) {
        if (byPercent <= 0 || isSalaryValid() == false) {
            throw new IllegalArgumentException("Please enter a valid percent salary");
        } else {
            calcManagerSalary = getSalary() * 0.01;
            newManagerSalary = calcManagerSalary + getSalary();
            System.out.println("Your new salary is " + newManagerSalary);
        }

    }

}
