package com.pluralsight;

public class TestOurObjectsApp {

    public static void main(String[] args) {

        //make some makeup
        Makeup foundation = new Makeup();
        Makeup blush = new Makeup();
        Makeup lipstick = new Makeup();
        Makeup someOtherMakeup = new Makeup("mascara", "MAC", 35.50);
        Makeup theNewHotness = new Makeup(99.99, "lip liner");
        Makeup someMakeupProduct = new Makeup(6.99);

        someMakeupProduct.setBrand("MAC");

        //the line above we created some makeup
        //this line we said what type the makeup is
        foundation.setType("foundation");
        blush.setType("blush");
        lipstick.setType("lipstick");
        //set the brand
        foundation.setBrand("MAC");
        blush.setBrand("Rare Beauty");
        lipstick.setBrand("elf");

        //set the prices for our makeup
        foundation.setPrice(50.00);
        blush.setPrice(25.66);
        lipstick.setPrice(19.99);

        System.out.println("foundation is of type " + foundation.getType() + " the brand is " + foundation.getBrand() + " price is " + foundation.getPrice() );
        System.out.println("blush is of type " + blush.getType() + " the brand is " + blush.getBrand() + " price is " + blush.getPrice() );
        System.out.println("lipstick is of type " + lipstick.getType() + " the brand is " + lipstick.getBrand() + " price is " + lipstick.getPrice() );
        System.out.println("someOtherMakeup is of type " + someOtherMakeup.getType() + " the brand is " +  someOtherMakeup.getBrand() +  " price is " + someOtherMakeup.getPrice() );
    }

}
