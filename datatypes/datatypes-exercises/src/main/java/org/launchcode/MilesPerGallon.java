package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons have you consumed?");
        double gallonsConsumed = input.nextDouble();

        double mpg = milesDriven / gallonsConsumed;
        System.out.println("Your vehicle gets " + mpg + " miles per gallon.");
    }
}
