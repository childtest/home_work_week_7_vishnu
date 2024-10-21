package homework;

/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
    HRA = basic salary 10%
    DA = Basic salary 8%
    TA = Basic salary 9%
    PF= Basic salary 20%
    Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
|   Salary Slip                 |
|______________________________|
| Employee Id  : 2564            |
| Employee Name : Jay               |
|______________________________|
| Basic Salary  : 25000.0       |
| HRA  10%  : 2500.0         |
| TA   8%  : 2250.0         |
| DA   9%  : 2000.0         |
| PF - 20&  : 5000.0         |
|______________________________|
| Gross Salary  : 26750.0       |
|===========================|*/

import java.util.Scanner;

public class Program_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        salarySlip(empId, empName, basicSalary);


    }

    public static void salarySlip(int empId, String empName, double basicSalary) {

        // Calculate HRA, DA, TA, PF
        double hra = basicSalary * 0.10; // 10% HRA
        double da = basicSalary * 0.08;  // 8% DA
        double ta = basicSalary * 0.09;  // 9% TA
        double pf = basicSalary * 0.20;  // 20% PF

        // Calculate Gross Salary
        double grossSalary = basicSalary + hra + da + ta - pf;

        // Print the salary slip
        System.out.println(" _______________________________ ");
        System.out.println("|         Salary Slip           |");
        System.out.println("|_______________________________|");
        System.out.printf("| Employee Id   : %-14d|\n", empId);
        System.out.printf("| Employee Name : %-14s|\n", empName);
        System.out.println("|_______________________________|");
        System.out.printf("| Basic Salary  : %-14.2f|\n", basicSalary);
        System.out.printf("| HRA  10%%      : %-14.2f|\n", hra);
        System.out.printf("| DA   8%%       : %-14.2f|\n", da);
        System.out.printf("| TA   9%%       : %-14.2f|\n", ta);
        System.out.printf("| PF  -20%%      : %-14.2f|\n", pf);
        System.out.println("|_______________________________|");
        System.out.printf("| Gross Salary  : %-14.2f|\n", grossSalary);
        System.out.println("|===============================|");
    }

}
