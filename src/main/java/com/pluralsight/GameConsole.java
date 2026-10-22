package com.pluralsight;

public class GameConsole {

    //instance variables or properties
    //usually private
    private String manufacturer;
    private String name;
    private int releaseYear;
    private double msrp;

    //the constructor that lets us create a game console
    public GameConsole() {

        //we could set the propertis in here if we want them to have default values
        this.manufacturer = "Nintendo";

    }

    //constructor that lets us set this when we create a new instance with the "new" keyworld like "new GameConstole()"
    public GameConsole(String manufacturer, String name, int releaseYear, double msrp) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.releaseYear = releaseYear;
        this.msrp = msrp;
    }

    //the getters and setters that let us change the properties
    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }
}
