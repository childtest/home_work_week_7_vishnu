package homework;

/* Write a program that tells us
input value is number or an alphabet or symbol.*/

import java.util.Scanner;

public class Program_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter any single character
        System.out.print("Enter a character: ");
        char value = sc.next().charAt(0);

        // Call method
        whatIsThis(value);

    }

    public static void whatIsThis(char value) {

        // Check if is a number, alphabet, or symbol
        if (Character.isDigit(value)) {
            System.out.println("The input is a number.");
        } else if (Character.isLetter(value)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }
    }
}
