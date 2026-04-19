/**
 *  Java program to demonstrate Liskov Substitution principle where child class can be used
 *  and does not throw exceptions and return zeros.
 */
package com.employee;

public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating parent and child classes.
        Employee e = new Employee();
        EmployeeInt e1 = new Intern();

        // Calling methods of created objects.
        System.out.println(e.calculateSalary());
        System.out.println(e.calculateBonus());
        System.out.println(e1.calculateSalary());

    }
}
