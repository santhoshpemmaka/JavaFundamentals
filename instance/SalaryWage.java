package instance;

public class SalaryWage {
    public static void main(String[] args) {
        // Employee employee = new Employee(10_100);
        Employee employee = new Employee(20_000, 500);
        System.out.println(Employee.numberofEmployess);
        int totalSalary = employee.calculateWage(10);
        System.out.println(totalSalary);

    }

}
