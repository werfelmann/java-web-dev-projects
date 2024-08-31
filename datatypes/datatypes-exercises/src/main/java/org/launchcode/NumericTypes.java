package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("Input the width of the rectangle: ");
        int width = input.nextInt();
        System.out.println("The rectangle is " + length + " units by " + width + " units.");
    }


}
