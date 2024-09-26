package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class RestaurantMenu {
    private static LocalDate date;

    public static void main (String[] args) {

        MenuItem itemOne = new MenuItem("Burger", 10.00, "a burger", "sandwich", true);
        MenuItem itemTwo = new MenuItem("Salad", 5.00, "a salad", "salad", true);
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(itemOne);
        menu.add(itemTwo);

        Menu newMenu = new Menu(LocalDate.now(), menu);

        System.out.println(itemOne.getName());

    }
}
