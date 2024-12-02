package com.bridgelabz.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
    static int wagePerHour = 20;
    static int fullDayHour = 8;
    static int partTimehour = 8;


    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch!");

        checkAttendance();

        int dailyWage = calculateDailyWage();
        System.out.println("\nDaily Employee Wage: $" + dailyWage);

        int partTimeWage = calculatePartTimeWage();
        System.out.println("\nPart time wage: $" + partTimeWage);
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
        return wagePerHour * partTimehour;
    }

}

