package com.driver;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeId, teamSize;
        String name;
        double salary, bonus;

        System.out.print("Enter the number of regular employees: ");
        int numRegularEmployees = scanner.nextInt();
        Employee[] regularEmployees = new Employee[numRegularEmployees];

        for (int i = 0; i < numRegularEmployees; i++) {
            System.out.print("Enter Employee ID for regular employee " + (i + 1) + ": ");
            employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Name for regular employee " + (i + 1) + ": ");
            name = scanner.nextLine();
            System.out.print("Enter Salary for regular employee " + (i + 1) + ": ");
            salary = scanner.nextDouble();
            regularEmployees[i] = new Employee(employeeId, name, salary);
        }

        System.out.print("Enter the number of managers: ");
        int numManagers = scanner.nextInt();
        Manager[] managers = new Manager[numManagers];

        for (int i = 0; i < numManagers; i++) {
            System.out.print("Enter Employee ID for manager " + (i + 1) + ": ");
            employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Name for manager " + (i + 1) + ": ");
            name = scanner.nextLine();
            System.out.print("Enter Salary for manager " + (i + 1) + ": ");
            salary = scanner.nextDouble();
            System.out.print("Enter Bonus for manager " + (i + 1) + ": ");
            bonus = scanner.nextDouble();
            System.out.print("Enter Team Size for manager " + (i + 1) + ": ");
            teamSize = scanner.nextInt();
            managers[i] = new Manager(employeeId, name, salary, bonus, teamSize);
        }

        scanner.close();

        // Display Regular Employees
        System.out.println("\nRegular Employees:");
        for (Employee employee : regularEmployees) {
            employee.displayDetails();
            System.out.println("------------------------");
        }

        // Display Managers
        System.out.println("\nManagers:");
        for (Manager manager : managers) {
            manager.displayDetails();
            System.out.println("------------------------");
        }
    }
}

