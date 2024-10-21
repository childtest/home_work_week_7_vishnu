package homework;

/* Write a java program that tells us that Input number is odd or even?
    HINT: use ternary operator (? :) */

import java.util.Scanner;

public class Program_1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        isOddOrEven(num);
    }

    public static void isOddOrEven(int num) {
        // Use ternary operator to check if the number is odd or even
        String result = (num % 2 == 0) ? "Even" : "Odd";

        // Output the result
        System.out.println("The number " + num + " is " + result);
    }
}
