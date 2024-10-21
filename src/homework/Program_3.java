package homework;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________
|                               |
|      Mark Sheet               |
|_______________________________|
| Name  : Jay      |
| Roll No : 08                  |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math  : 98       |
| Science : 90                  |
| English : 85                  |
|_______________________________|
| Total  : 273     |
|_______________________________|
| Percentage : 91.0             |
| Result  : Pass                |
| Grade  :  A+                  |
|_______________________________| */

import java.util.Scanner;

public class Program_3 {

    static String[] subjects = {"Math", "Science", "English"};
    static int[] marks;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get Student Name and Roll Number
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        // Declare array for  marks
        marks = new int[3];

        // get marks for subject
        for (int i = 0; i < subjects.length; i++) {
            marks[i] = getMarks(sc, subjects[i]);
        }

        // Calculate total and percentage
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float percentage = total / (float) subjects.length;

        // Determine pass/fail and grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade = calculateGrade(percentage);

        // Method for Print Mark Sheet

        printMarkSheet(name,rollNo,total,percentage, result, grade);

    }

    public static void printMarkSheet(String name, int rollNo, int total,
                                      float percentage, String result, String grade) {

       /* System.out.println(" _______________________________ ");
        System.out.println("|                               |");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.println("| Name      : "+ name +"            |");
        System.out.println("| Roll No   : " + rollNo + "                |");
        System.out.println("|________________________________|");
        System.out.println("| Subjects  : Marks              |");
        System.out.println("|________________________________|");

        // Print marks for each subject using the array
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("| " + subjects[i] + "   :           " + marks[i] + "         |");
        }

        System.out.println("|_________________________________|");
        System.out.println("| Total     : " + total + "                   |");
        System.out.println("|_________________________________|");
        System.out.println("| Percentage: " + percentage + "             |");
        System.out.println("| Result    : " + result + "                |");
        System.out.println("| Grade     : " + grade + "                  |");
        System.out.println("|_________________________________|");*/


        System.out.println(" ___________________________________ ");
        System.out.println("|                                   |");
        System.out.println("|          Mark Sheet               |");
        System.out.println("|___________________________________|");
        System.out.printf("| %-10s : %-20s |\n", "Name", name);
        System.out.printf("| %-10s : %-20s |\n", "Roll No", rollNo);
        System.out.println("|___________________________________|");
        System.out.printf("| %-7s : %-10s               |\n", "Subjects", "Marks");
        System.out.println("|___________________________________|");

        // Print marks for each subject with aligned format
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("| %-5s : %-23d |\n", subjects[i], marks[i]);
        }

        System.out.println("|___________________________________|");
        System.out.printf("| %-7s : %-23d |\n", "Total", total);
        System.out.println("|___________________________________|");
        System.out.printf("| %-4s : %-23.2f |\n", "Percentage", percentage);
        System.out.printf("| %-7s : %-23s |\n", "Result", result);
        System.out.printf("| %-7s : %-23s |\n", "Grade", grade);
        System.out.println("|___________________________________|");
    }

    // Method for get marks with validation
    public static int getMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subject + " (0 to 100): ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        }
        return marks;
    }

    // Method for calculate grade
    public static String calculateGrade(float percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "F";
        }
    }

}
