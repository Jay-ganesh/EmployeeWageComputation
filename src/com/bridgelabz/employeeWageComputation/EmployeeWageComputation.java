package com.bridgelabz.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch!");

        checkAttendance();
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
}

