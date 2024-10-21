package homework;

/*. Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else) */

import java.util.Scanner;

public class Program_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Enter symbol
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

      opration(num1, num2, operator);

    }

    public static void opration(double num1, double num2, char operator){

        // Perform the operation based on the operator
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2)); // Addition
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2)); // Subtraction
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2)); // Multiplication
        } else if (operator == '/') {
            // Check for division by zero
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2)); // Division
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator! Please enter one of +, -, *, /.");

            main(null);
        }
    }
}
