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
public class Employee {

      private final String name;
      private final double salary;
      double newSalary;

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
       * @return name
       */
      public String getName() {
            return this.name;
      }

      /**
       *
       * @return boolean
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
       * @return salary
       */
      public double getSalary() {
            return this.salary;
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
            if (byPercent <= 0 || !isSalaryValid()) {
                  throw new IllegalArgumentException("Please enter a valid percent salary");
            } else {
                  double calcSalary = getSalary() * byPercent;
                  newSalary = calcSalary + getSalary();
                  System.out.println("Your new salary is " + newSalary);
            }
      }

}
