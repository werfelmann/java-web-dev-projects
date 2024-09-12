package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public void setDescription (String description) {
        if (description != null && !description.isEmpty()) {
            this.description = description;
        } else {
            throw new IllegalArgumentException("Description cannot be empty");
        }
    }

    public void setCategory (String category) {
        if (category != null && !category.isEmpty()) {
            this.category = category;
        } else {
            throw new IllegalArgumentException("Category cannot be empty");
        }
    }

    public void setIsNew (boolean isNew) {
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
}
