package edu.du.ict4305.grouptutorialassignmentfour; /**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeekFour
 * @Instructor: Dr. Sherri Maciosek
 */

/**
 *
 * @Date: 10/5/22
 * @author lutherchikumba
 *
 */
public class CompositionManager {
    private final String name;
    private final double salary;
    public CompositionManager(String name, double salary) {
        this.name = name;
        this.salary = salary;
      }
    public void raiseSalary(double byPercent) {
        Employee employ = new Employee(name, salary);
        if (byPercent <= 0 || !employ.isSalaryValid()) {
            throw new IllegalArgumentException("Please enter a valid percent salary");
        } else {
            double calcManagerSalary = employ.getSalary() * byPercent;
            double newManagerSalary = calcManagerSalary + employ.getSalary();
            System.out.println("Your new salary is " + newManagerSalary);
        }

    }
}
