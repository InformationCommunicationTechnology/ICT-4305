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
public class GroupTutorialAssignmentWeekFour {

    private static String name;
    private static double salary;
    private static double getSalary;
    private static boolean validateName;
    private static boolean validateSalary;
    private static Employee emp;
    private static Manager man;

    public static void main(String[] args) {
        emp = new Employee("", 0);

        //Validating the name
        try {
            validateName = emp.isNameEmpty();

        } catch (Exception ex) {
            System.out.println(ex);
        }

        //Validating the salary
        try {
            validateSalary = emp.isSalaryValid();

        } catch (Exception ex) {
            System.out.println(ex);
        }

        //Raise the salary
        try {
            emp.raiseSalary(1.0);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        man = new Manager("Tafadzwa", 400.0);

        //Raise manager's salary
        try {
            man.raiseSalary(4.0);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
