package OOPS_EmployeeWage;

// Employee partTime or fullTime present using Switch Case.
public class Uc4 {
    //constants
    public static final int fullTime = 1;
    public static final int partTime = 2;
    public static final int wagePerHour = 20;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        //Variables
        int empHour = 0;
        int empWage = 0;

        //Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case fullTime:
                empHour = 8;
                System.out.println("Employee is full time present");
                break;
            case partTime:
                empHour = 4;
                System.out.println("Employee is part time present");
                break;
            default:
                empHour = 0;
                System.out.println("Employee Is Absent");
        }
        empWage = empHour * wagePerHour;
        System.out.println("Employee Wage is :" + empWage);
    }
}
