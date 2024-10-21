package homework;

import java.util.Scanner;

public class Program_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        numberCheck(number);

        sc.close();
    }

    public static void numberCheck(double number) {

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

    }

}
