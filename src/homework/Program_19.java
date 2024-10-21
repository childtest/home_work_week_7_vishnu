package homework;

/* Write a Java program to calculate the average value of array elements. */

import java.util.Scanner;

public class Program_19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        // Create an array of given size
        int[] array = new int[size];

        // Ask the user to enter the array elements
        System.out.println("Enter the elements of the array:");

        // Loop to enter array elements
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Initialize variable to store sum
        int sum = 0;

        // Loop to calculate the sum of array elements
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / size;

        // Output the average
        System.out.println("The average value of the array elements is: " + average);

    }
}
