package homework;

/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
not? */

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // calling method with params to check leap year
        isLeapYear(year);

    }

    public static void isLeapYear(int year) {
        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
