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
        return bonus;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public double calculateTotalSalary() {
        return super.calculateTotalSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Team Size: " + teamSize);
    }
}