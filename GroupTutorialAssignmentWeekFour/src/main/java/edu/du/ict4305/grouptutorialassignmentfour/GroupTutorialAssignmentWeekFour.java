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
public class GroupTutorialAssignmentWeekFour {

      private static Employee emp;
      private static Manager man;

      public static void main(String[] args) {
            emp = new Employee("luther", 400.0);

            //Validating the name
            try {
                  emp.isNameEmpty();

            } catch (Exception ex) {
                  System.out.println(ex);
            }

            //Validating the salary
            try {
                  emp.isSalaryValid();

            } catch (Exception ex) {
                  System.out.println(ex);
            }

            //Raise the salary
            try {
                  emp.raiseSalary(.05);

            } catch (Exception ex) {
                  System.out.println(ex);
            }

            man = new Manager("Tafadzwa", 400.0);

            //Raise manager's salary
            try {
                  man.raiseSalary(.01);

            } catch (Exception ex) {
                  System.out.println(ex);
            }

            CompositionManager  compositionManager = new CompositionManager("luther", 400);

            //Raise manager's salary using Composition instead of Inheritance
            try {
                  compositionManager.raiseSalary(.50);

            } catch (Exception ex) {
                  System.out.println(ex);
            }
      }
}
