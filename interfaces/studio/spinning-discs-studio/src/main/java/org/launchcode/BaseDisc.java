package org.launchcode;

public abstract class BaseDisc {
    //fields
    private int averageSpinSpeedRPM;
    private double storageCapacity;
    private String contents;
    private String name;

    //constructor
    public BaseDisc(int averageSpinSpeedRPM, double storageCapacity, String contents, String name) {
        this.averageSpinSpeedRPM = averageSpinSpeedRPM;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.name = name;
    }

    //abstract methods
    public String getContents() {
        return null;
    }

    public abstract String getDiscType();


    //non-abstract methods
    public String getName() {
        return name;
    };
    public int getAverageSpinSpeedRPM() {
        return averageSpinSpeedRPM;
    }
    public double getStorageCapacity() {
        return storageCapacity;
    }
}
