package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Laptop myNewLaptop = new Laptop("MacBook Pro", 16, 500, "macOS Sonoma", 2500, 16);

        System.out.println(myNewLaptop.getScreenSize());
        System.out.println(myNewLaptop.costPerGigOfStorage());
        myNewLaptop.openIntelliJ();
    }


}