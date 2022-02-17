package OOPS_EmployeeWage;

// Empolyee partTime or fullTime present.
public class Uc3 {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        //Constants
        int fullTime = 1;
        int partTime = 2;
        int wagePerHour = 20;

        //Variables
        int empWage = 0;
        int empHour = 0;

        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == fullTime) {
            empHour = 8;
            empWage = empHour * wagePerHour;
            System.out.println("Employee is full time present");
            System.out.println("Employee Wage :" + empWage + "Rs");
        } else if (empCheck == partTime) {
            empHour = 4;
            empWage = empHour * wagePerHour;
            System.out.println("Employee is part time present");
            System.out.println("Employee Wage :" + empWage + "Rs");
        } else
            System.out.println("Employee Is Absent");
    }
}
