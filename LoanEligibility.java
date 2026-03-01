/*
 * NAME : KARUBIU MILELE WANJIRU
 * REGISTRATION NO : CT100/G/24362/24
 */

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Prompt the user for their annual income
        System.out.print("Enter your annual income (in Sh): ");
        double income = input.nextDouble();

        // Check if the customer is 21 or over AND has an income of at least 21000
        if (age >= 21 && income >= 21000) {
            System.out.println("Congratulations you qualify for a loan.");
        } else {
            System.out.println("Unfortunately, we are unable to offer you a loan at this time .");
        }

        // Close the scanner
        input.close();
    }
}
