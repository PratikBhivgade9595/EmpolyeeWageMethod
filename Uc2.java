package OOPS_EmployeeWage;

// Employee if present then employee wage is.
public class Uc2 {
    public void empWageCheck() {
        System.out.println("Welcome To Employee Wage Computation");

        // Constants
        int fullTime = 1;
        int wagePerHour = 20;

        //Variables
        int empWage = 0;
        int empHour = 0;

        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == fullTime) {
            empHour = 8;
            empWage = empHour * wagePerHour;
            System.out.println("Employee is present.");
            System.out.println("Employee Wage :" + empWage + "Rs");
        } else
            System.out.println("Employee is Absent");
    }

    public static void main(String[] args) {
        Uc2 obj = new Uc2();
        obj.empWageCheck();
    }
}
