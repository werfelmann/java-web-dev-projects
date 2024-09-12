package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu() {
        this.lastUpdated = LocalDate.now();
        this.items = new ArrayList<>();
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(MenuItem item) {
        this.items.remove(item);
        this.lastUpdated = LocalDate.now();
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

}
