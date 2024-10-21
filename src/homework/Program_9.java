package homework;

/*Same as above program-8 using switch statement. */

import java.util.Scanner;

public class Program_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter any alphabet between 'A' and 'F'
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = sc.next().toUpperCase().charAt(0);

        printCityName(alphabet);

    }

    public static void printCityName(char alphabet) {

        // print city name based on the alphabet
        switch (alphabet) {
            case 'A':
                System.out.println("A for Ahmedabad");
                break;
            case 'B':
                System.out.println("B for Banglore");
                break;
            case 'C':
                System.out.println("C for chennai");
                break;
            case 'D':
                System.out.println("D for Dubai");
                break;
            case 'E':
                System.out.println("E for Edinburgh");
                break;
            case 'F':
                System.out.println("F for Faridabad");
                break;
            default:
                System.out.println("Invalid entry");

                main(null);
                break;
        }
    }
}
