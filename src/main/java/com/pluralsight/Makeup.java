package com.pluralsight;

public class Makeup {

    private String type; //blush, lipstick, mascara
    private String brand;
    private double price;

    //this is here if you want it or not
    public Makeup() {}

    //constructor with parameters
    public Makeup(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    //set some of the properties and maybe hard code some of the others
    public Makeup(double price, String type) {
        this.price = price;
        this.type = type;
        this.brand = "elf";
    }

    //just a constructor that sets the price
    public Makeup(double price) {
        this.price = price;
    }

    //getter and setter for the type date member/property
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
