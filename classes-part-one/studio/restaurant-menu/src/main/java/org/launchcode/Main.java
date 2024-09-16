package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu newMenu = new Menu();

        MenuItem veggieBurger = new MenuItem(9.99, "a tasty blackbean burger", "sandwichs", true);
        MenuItem greekSalad = new MenuItem(10.99, "fresh veggies, olives, and feta on a bed of lightly dressed greens", "salads", true);
        MenuItem macAndCheese = new MenuItem(8.99, "elbow pasta with a cheesey sauce", "comfort food", true);

        newMenu.addMenuItem(veggieBurger);
        newMenu.addMenuItem(greekSalad);
        newMenu.addMenuItem(macAndCheese);

        printMenu(newMenu);

        System.out.println("Menu last updated on: " + newMenu.getLastUpdated());
    }

    private static void printMenu(Menu newMenu) {
        ArrayList<MenuItem> items = newMenu.getItems();
        for (MenuItem item : items) {
            System.out.println(item.getCategory() + ": " + item.getDescription() + " - $" + item.getPrice() + " (New: " + item.isNew() + ")");
        }
    }



}
