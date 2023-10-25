package com.detroitlabs.wilkswingshop.model;

public class Drink {
    private String type;
    private String category;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Drink(String category, String type, double price) {
        this.type = type;
        this.category = category;
        this.price = price;
    }
}
