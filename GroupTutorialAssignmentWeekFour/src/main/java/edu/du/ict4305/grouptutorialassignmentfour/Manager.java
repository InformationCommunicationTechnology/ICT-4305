/**
 * @Course: ICT 4305
 * @File:
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.grouptutorialassignmentfour;

/**
 *
 * @Date: 10/01/2022
 * @author lutherchikumba
 *
 */
public class Manager extends Employee {

      public Manager(String name, double salary) {
            super(name, salary);
      }

      /**
       *
       * @param byPercent
       */
      @Override
      public void raiseSalary(double byPercent) {
            if (byPercent <= 0 || !isSalaryValid()) {
                  throw new IllegalArgumentException("Please enter a valid percent salary");
            } else {
                  double calcManagerSalary = getSalary() * byPercent;
                  double newManagerSalary = calcManagerSalary + getSalary();
                  System.out.println("Your new salary is " + newManagerSalary);
            }

      }

}
