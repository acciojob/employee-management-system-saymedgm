package com.driver;

public class Manager extends Employee {
    private double bonus;
    private int teamSize;

    public Manager(int employeeId, String name, double salary, double bonus, int teamSize) {
        super(employeeId, name, salary);
        this.bonus = bonus;
        this.teamSize = teamSize;
    }

    public double getBonus() {
    	// your code goes here
        return bonus;
    }

    public int getTeamSize() {
    	// your code goes here
        return teamSize;
    }

    @Override
    public double calculateTotalSalary() {
    	// your code goes here
        return super.calculateTotalSalary() + bonus;
    }

    @Override
    public void displayDetails() {
    	// your code goes here
    }
}
