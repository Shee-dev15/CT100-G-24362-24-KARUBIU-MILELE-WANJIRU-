/*
 * Registration number: CT100/G/24362/24
 * NAME: KARUBIU MILELE WANJIRU
 * Program: UserInput.java
 * Purpose: Collects user's height, bank balance, and phone number, then displays them.
 */

// We must import the Scanner class to read user input
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        // Create a Scanner object  (System.in)
        Scanner input = new Scanner(System.in);
        
        // 1. Prompt for Height 
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        float height = input.nextFloat();
        
        // 2. Prompt for Bank Balance (Using double for large currency values)
        System.out.print("Enter your bank balance (in KES): ");
        double bankBalance = input.nextDouble();
        
        // *Crucial Step*()
        input.nextLine(); 
        
        // 3. Prompt for Phone Number 
        
        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();
        
        input.close();
        
        // Display the collected inputs back to the user neatly
        System.out.println("\n--------------------------------------------------");
        System.out.println("User Details Summary:");
        System.out.println("--------------------------------------------------");
        System.out.println("Height       : " + height + " m");
        System.out.println("Bank Balance : KES " + bankBalance);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("--------------------------------------------------");
    }
}
