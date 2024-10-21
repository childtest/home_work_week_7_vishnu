package homework;

/* Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class Program_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get sales details
        System.out.print("Enter Sales ID: ");
        int salesId = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter Seller's Name: ");
        String sellerName = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = sc.nextDouble();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // call method

        calculatecommission(salesId, sellerName, salesAmount, basicSalary);

    }

    public static void calculatecommission(int salesId, String sellerName,
                                           double salesAmount, double basicSalary) {

        // Calculate commission based on sales amount
        double commission;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;  // 35% commission
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;  // 20% commission
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;  // 10% commission
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;  // 5% commission
        } else {
            commission = salesAmount * 0.02;  // 2% commission
        }

        createRecipte(salesId, sellerName, salesAmount, basicSalary, commission);

    }

    public static void createRecipte(int salesId, String sellerName,
                                     double salesAmount, double basicSalary, double commission) {

        // Print the sales details and commission
        System.out.println(" _______________________________ ");
        System.out.println("|         Sales Commission      |");
        System.out.println("|_______________________________|");
        System.out.printf("| Sales ID      : %-15d|\n", salesId);
        System.out.printf("| Seller Name   : %-15s|\n", sellerName);
        System.out.printf("| Sales Amount  : %-15.2f|\n", salesAmount);
        System.out.printf("| Basic Salary  : %-15.2f|\n", basicSalary);
        System.out.printf("| Commission    : %-15.2f|\n", commission);
        System.out.println("|_______________________________|");

    }

}
