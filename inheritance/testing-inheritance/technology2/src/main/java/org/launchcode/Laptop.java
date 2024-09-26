package org.launchcode;

public class Laptop extends Computer {
    private final int screenSize;

    public Laptop(int ram, int storage, String os, double cost, int screenSize) {
        super(ram, storage, os, cost);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void openIntelliJ() {
        System.out.println("Opening IntelliJ on your Laptop");
    }
}
