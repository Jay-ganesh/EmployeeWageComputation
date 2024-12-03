package com.bridgelabz.employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
        private static final int IS_PART_TIME = 1;
        private static final int IS_FULL_TIME = 2;

        public static void computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            int totalEmpHrs = 0, totalWorkingDays = 0, totalEmpWage = 0;

            System.out.println("Calculating Employee Wage for Company: " + company);

            while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
                totalWorkingDays++;
                int empHrs = 0;

                Random random = new Random();
                int empCheck = random.nextInt(3);

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                }

                totalEmpHrs += empHrs;
                int dailyWage = empHrs * empRatePerHour;
                totalEmpWage += dailyWage;

                System.out.println("Day: " + totalWorkingDays + " | Hours Worked: " + empHrs + " | Daily Wage: " + dailyWage);
            }

            System.out.println("Total Employee Wage for Company " + company + ": " + totalEmpWage);
            System.out.println("=============================================");
        }

        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program!");
            
            computeEmployeeWage("Google", 20, 20, 100);
            computeEmployeeWage("Amazon", 25, 22, 120);
            computeEmployeeWage("Microsoft", 30, 25, 150);
        }
}

