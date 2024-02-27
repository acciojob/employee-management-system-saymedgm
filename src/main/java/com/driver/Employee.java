package com.driver;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
    	// your code goes here
    	return employeeId;
    }

    public String getName() {
    	// your code goes here
        return name;
    }

    public double getSalary() {
    	// your code goes here
        return salary;
    }

    public double calculateTotalSalary() {
    	// your code goes here
        return salary;
    }

    public void displayDetails() {
    	// your code goes here
    }
}