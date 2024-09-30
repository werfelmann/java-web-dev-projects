package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem itemOne = new MenuItem("Burger", 10.99, "a tasty burger, served with fries", "main", true);
        MenuItem itemTwo = new MenuItem("Salad", 6.99, "a salad of mixed greens", "salad", true);
        MenuItem itemThree = new MenuItem("Apple Pie", 4.99, "Warm apple pie with a scoop of ice cream", "dessert", false);

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(itemOne);
        menu.add(itemTwo);

        Menu newMenu = new Menu(LocalDate.now(), menu);

        newMenu.printMenu();

        newMenu.addMenuItem(itemThree);
        System.out.println("\nAfter adding Apple Pie:");
        newMenu.printMenu();

        System.out.println("\nAttempting to add a duplicate item:");
        newMenu.addMenuItem(itemOne);
        newMenu.printMenuItem(itemOne);
    }
}

