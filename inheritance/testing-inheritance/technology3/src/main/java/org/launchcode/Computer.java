package org.launchcode;

public class Computer {
    private String name;
    private int ram;
    private int storage;
    private String os;
    private double cost;

    public Computer(String name, int ram, int storage, String os, double cost) {
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public double getCost() {
        return cost;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double costPerGigOfStorage(double cost, int storage) {
        return cost/storage;
    }
}
