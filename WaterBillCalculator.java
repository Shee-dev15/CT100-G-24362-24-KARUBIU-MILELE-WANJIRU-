/*
 * NAME: KARUBIU MILELE WANJIRU
 * REGISTRATION NO: CT100/G/24362/24
 */

import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of units consumed
        System.out.print("Enter the number of water units consumed: ");
        int units = input.nextInt();
        
        int billAmount = 0;

        // Calculate the bill based on the consumption rules
        if (units >= 0 && units <= 30) {
            billAmount = units * 20;
        } 
        else if (units >= 31 && units <= 60) {
            billAmount = units * 25;
        } 
        else if (units > 60) {
            billAmount = units * 30;
        } 
        else {
            // Handle invalid (negative) inputs gracefully
            System.out.println("Invalid input. Water units cannot be negative.");
            
            // Exit the program early since the input is invalid
            System.exit(0); 
        }

        // Display the final calculated bill
        System.out.println("Your total water bill is: " + billAmount + " KES");

        // Close the scanner
        input.close();
    }
}
