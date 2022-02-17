package OOPS_EmployeeWage;

// Employee is present or absent.
public class Uc1 {
    public void check() {
        System.out.println("Welcome To Employee Wage Computation");

        // Constants
        int fullTime = 1;

        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == fullTime)
            System.out.println("Employee is present");
        else
            System.out.println("Empolyee is Absent");
    }

    public static void main(String[] args) {
        Uc1 obj = new Uc1();
        obj.check();
    }
}
