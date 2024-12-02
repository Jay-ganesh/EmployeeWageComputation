package com.bridgelabz.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
    static int wagePerHour = 20;
    static int fullDayHour = 8;
    static int partTimeHour = 8;
    static int workingDaysPerMonth = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch!");

        checkAttendance();

        int dailyWage = calculateDailyWage();
        System.out.println("\nDaily Employee Wage: $" + dailyWage);

        int partTimeWage = calculatePartTimeWage();
        System.out.println("\nPart time wage: $" + partTimeWage);

        calculateWageWithSwitchCase();
        calculateWageForMonth();

    }

    public static void checkAttendance() {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("The employee is Present.");
        } else {
            System.out.println("The employee is Absent.");
        }
    }

    public static int calculateDailyWage() {
        return wagePerHour * fullDayHour;
    }
    public static int calculatePartTimeWage(){
        return wagePerHour * partTimeHour;
    }
    public static void calculateWageWithSwitchCase() {
        Random random = new Random();
        int empType = random.nextInt(3);

        System.out.println("Solving Using Switch Case:");
        int empHours = 0;
        switch (empType) {
            case 0:
                System.out.println("Employee is Absent. No wage.");
                empHours = 0;
                break;
            case 1:
                System.out.println("Employee is Full-Time.");
                empHours = fullDayHour;
                break;
            case 2:
                System.out.println("Employee is Part-Time.");
                empHours = partTimeHour;
                break;
        }

        int wage = empHours * wagePerHour;
        System.out.println("Wage: $" + wage);
    }
    public static int calculateWageForMonth() {
        int totalWage = 0;
        for (int day = 1; day <= workingDaysPerMonth; day++) {
            totalWage += calculateDailyWage();
        }
        return totalWage;
    }


}

