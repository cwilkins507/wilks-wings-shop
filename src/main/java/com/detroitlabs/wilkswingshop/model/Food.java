package com.detroitlabs.wilkswingshop.model;

public class Food {

        private String category;
        private String name;
        private int heat;
        private double price;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Food(String category, String name, int heat, double price) {

        this.category = category;
        this.name = name;
        this.heat = heat;
        this.price = price;
    }
}
