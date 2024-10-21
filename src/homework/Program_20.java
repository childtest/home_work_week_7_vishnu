package homework;

import java.util.Scanner;

public class Program_20 {

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

        // Ask the user for the value to search for
        System.out.print("Enter the value to search: ");
        int value = sc.nextInt();

        // Check if the array contains the value
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("The array contains the value " + value + ".");
        } else {
            System.out.println("The array does not contain the value " + value + ".");
        }

    }
}
