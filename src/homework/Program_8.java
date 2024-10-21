package homework;

/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry */

import java.util.Scanner;

public class Program_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter any alphabet between 'A' and 'F'
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = sc.next().toUpperCase().charAt(0);

        printCityName(alphabet);

    }

    public static void printCityName(char alphabet){

        // print city name based on the alphabet
        if (alphabet == 'A') {
            System.out.println("A for Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("B for Banglore");
        } else if (alphabet == 'C') {
            System.out.println("C for chennai");
        } else if (alphabet == 'D') {
            System.out.println("D for Dubai");
        } else if (alphabet == 'E') {
            System.out.println("E for Edinburgh");
        } else if (alphabet == 'F') {
            System.out.println("F for Faridabad");
        } else {
            System.out.println("Invalid entry");

            main(null);
        }
    }
}
