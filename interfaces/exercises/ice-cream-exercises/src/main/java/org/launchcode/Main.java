package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("Flavors unsorted:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getAllergens());
        }
        System.out.println("\n" + "Flavors sorted by number of allergens:");
        flavors.sort(comparator);
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getAllergens());
        }
        System.out.println("\n Cones unsorted:");
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }
        System.out.println("\n" + "Cones sorted by cost:");
        cones.sort(coneComparator);
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}