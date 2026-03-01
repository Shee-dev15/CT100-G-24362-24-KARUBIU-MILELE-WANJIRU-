/*
 * NAME : KARUBIU MILELE WANJIRU
 * REGISTRATION NO : CT100/G/24362/24
 */

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Accept the principal amount, time, and rate from the user
        System.out.print("Enter the principal amount (Sh): ");
        double principal = input.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = input.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = input.nextDouble();

        // 2. Calculate Simple Interest
        // Formula: (Principal * Time * Rate) / 100
        double simpleInterest = (principal * time * rate) / 100;

        // 3. Calculate Compound Interest
        // Formula for Total Amount: Principal * (1 + Rate/100)^Time
        // We use Math.pow() to calculate the exponent (power)
        double compoundAmount = principal * Math.pow(1 + (rate / 100), time);
        
        // Compound Interest is the Total Amount minus the original Principal
        double compoundInterest = compoundAmount - principal;

        // 4. Display the results
        System.out.println("\n--- Interest Calculation Results ---");
        System.out.println("Simple Interest earned: Sh " + simpleInterest);
        System.out.println("Compound Interest earned: Sh " + compoundInterest);
        
        // Optional: Show the final total balances
        System.out.println("\nTotal Balance (Simple): Sh " + (principal + simpleInterest));
        System.out.println("Total Balance (Compound): Sh " + compoundAmount);

        input.close();
    }
}
