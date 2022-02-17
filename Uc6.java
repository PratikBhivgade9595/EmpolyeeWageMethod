package OOPS_EmployeeWage;

// Employee wage calculation for 100 hrs a month and 20 days.
public class Uc6 {
    //Constants
    public static final int fullTime = 1;
    public static final int partTime = 2;
    public static final int wagePerHour = 20;
    public static final int workingDayPerMonth = 20;
    public static final int workingHourPerMonth = 100;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        //Variables
        int empHour = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHour = 0;
        int totalWorkingDay = 0;

        //Computation
        while (totalEmpHour <= workingHourPerMonth && totalWorkingDay < workingDayPerMonth) {
            totalWorkingDay++;
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
            totalEmpHour = totalEmpHour + empHour;
            System.out.println("Employee Day :" + totalWorkingDay + "__" + "Employee Hour :" + empHour);
            empWage = empHour * wagePerHour;
            System.out.println("Employee Wage Per Day :" + empWage + "Rs");
            System.out.println("---------------------------------------------");
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Total Empolyee Wage For A Month :" + totalEmpWage + "Rs");
        System.out.println("Total Empolyee Hour For A Month :" + totalEmpHour + "Hr");
    }
}
