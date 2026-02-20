/*
 * Registration number: CT100/G/24362/24
 * NAME: KARUBIU MILELE WANJIRU
 * Program: CylinderCalculator.java
 * Purpose: Calculates the volume and surface area of a cylinder based on user input.
 */

import java.util.Scanner;

public class CylinderCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // 1. Prompt the user for radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        
        // 2. Calculate Volume (Pi * r^2 * h)
        double volume = Math.PI * Math.pow(radius, 2) * height;
        
        // 3. Calculate Surface Area (2 * Pi * r^2 + 2 * Pi * r * h)
        double surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
        
        // 4. Display the results neatly (using printf to round to 2 decimal places)
        System.out.println("\n--- Cylinder Measurements ---");
        System.out.printf("Volume       : %.2f\n", volume);
        System.out.printf("Surface Area : %.2f\n", surfaceArea);
        System.out.println("-----------------------------");
        
        input.close();
    }
}
