package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu newMenu = new Menu();

        MenuItem veggieBurger = new MenuItem("Veggie Burger", 9.99, "a tasty blackbean burger", "sandwichs", true);
        MenuItem greekSalad = new MenuItem("Greek Salad", 10.99, "fresh veggies, olives, and feta on a bed of lightly dressed greens", "salads", true);
        MenuItem macAndCheese = new MenuItem("Mac and Cheese", 8.99, "elbow pasta with a cheesey sauce", "comfort food", true);
        MenuItem veggieBurger2 = new MenuItem("Veggie Burger", 9.99, "a tasty blackbean burger", "sandwichs", true);

        newMenu.addMenuItem(veggieBurger);
        newMenu.addMenuItem(greekSalad);
        newMenu.addMenuItem(macAndCheese);

        printMenu(newMenu);

        System.out.println("Menu last updated on: " + newMenu.getLastUpdated());

        System.out.println(veggieBurger.equals(veggieBurger2));
    }

    private static void printMenu(Menu newMenu) {
        ArrayList<MenuItem> items = newMenu.getItems();
        for (MenuItem item : items) {
            System.out.println(item.getCategory() + ": " + item.getDescription() + " - $" + item.getPrice() + " (New: " + item.isNew() + ")");
        }
    }



}
