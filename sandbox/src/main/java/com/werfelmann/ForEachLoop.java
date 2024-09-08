package com.werfelmann;

public class ForEachLoop {
    public static void main(String [] args) {
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                continue;
            }
            System.out.println("Not here");
        }
    }
}
