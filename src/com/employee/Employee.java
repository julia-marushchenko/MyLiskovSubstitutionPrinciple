package com.employee;

/**
 * Employee class.
 */
public class Employee implements EmployeeInt, Bonus{

    @Override
    public double calculateSalary() {
        return 5000;
    }

    @Override
    public double calculateBonus() {
        return 100;
    }
}
