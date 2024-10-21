package homework;

/*Write a java program to input any number and find out
 if it’s odd or even*/

import java.util.Scanner;

public class Program_6 {

    public static void main(String[] args) {

        // Create a Scanner object to get input
        Scanner sc = new Scanner(System.in);

        //get any number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        isOddOrEven(number);

    }

    public static void isOddOrEven(int number) {

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }
}
