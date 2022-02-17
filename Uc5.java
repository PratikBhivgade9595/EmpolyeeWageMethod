package OOPS_EmployeeWage;

//Employee partTime or FullTime present Calculation for a month.
public class Uc5 {
    //Constants
    public static final int fullTime = 1;
    public static final int partTime = 2;
    public static final int wagePerHour = 20;
    public static final int workingDayPerMonth = 20;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        //Variables
        int empHour = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        //Computation
        for (int day = 1; day <= workingDayPerMonth; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case fullTime:
                    empHour = 8;
                    System.out.println("Employee is fullTime present");
                    break;
                case partTime:
                    empHour = 4;
                    System.out.println("Employee is partTime present");
                    break;
                default:
                    empHour = 0;
                    System.out.println("Employee is Absent");
            }
            empWage = empHour * wagePerHour;
            System.out.println("Employee Wage Per Day :" + empWage + "Rs");
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Total Empolyee Wage For A Month :" + totalEmpWage + "Rs");
    }
}
