package org.launchcode;

public class SmartPhone extends Computer {
    private final double screenSize;
    private String provider;

    public SmartPhone(int ram, int storage, String os, double cost, double screenSize, String provider) {
        super(ram, storage, os, cost);
        this.screenSize = screenSize;
        this.provider = provider;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void sendText(String textMessage) {
        System.out.println("New phone, who dis?");
    }
}
