package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate date, ArrayList<MenuItem> items) {
        this.lastUpdated = date;
        this.items = items;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item) {
        if (!items.contains(item)) {
            items.add(item);
            this.lastUpdated = LocalDate.now();
        } else {
            System.out.println("Item already exists on the menu.");
        }
    }

    public void removeMenuItem(MenuItem item) {
        if (items.contains(item)) {
            items.remove(item);
            this.lastUpdated = LocalDate.now();
        } else {
            System.out.println("Item not found on the menu.");
        }
    }

    public void printMenu() {
        System.out.println("Menu (Last Updated: " + lastUpdated + "):");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice() + " - " + item.getDescription());
        }
    }

    public void printMenuItem(MenuItem item) {
        System.out.println(item.getName() + " - $" + item.getPrice() + " - " + item.getDescription());
    }

    public void isUpdated() {
        System.out.println("Menu last updated on " + getLastUpdated() + ".");
    }


}


