package homework;

/* Write a Java program to sort a numeric array and a string array. */

import java.util.Arrays;

public class Program_17 {

    public static void main(String[] args) {

        // Numeric array
        int[] numArray = {42, 23, 4, 16, 8, 15};
        // String array
        String[] strArray = {"Banana", "Apple", "Orange", "Mango", "Peach"};

        // Sorting numeric array
        Arrays.sort(numArray);
        // Sorting string array
        Arrays.sort(strArray);

        // Display sorted numeric array
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numArray));

        // Display sorted string array
        System.out.println("Sorted String Array: " + Arrays.toString(strArray));
    }

}
