package com.pluralsight;

public class GameConsoleApp {

    public static void main(String[] args) {

        //create a game console
        GameConsole someGameConsole = new GameConsole("Microsoft", "XBOX", 2027, 599.99);

        //use the getters to get the information about the game console
        System.out.println("the " + someGameConsole.getName() + " was made by " + someGameConsole.getManufacturer() + " in " + someGameConsole.getReleaseYear());

        //change the msrp
        someGameConsole.setMsrp(999.99);

        System.out.println(" in 1 year the new price will be  " + someGameConsole.getMsrp());

        Song mySong = new Song("Cherish", "Cherish Anthem", "Debut Album", "Worship");
        Song myOtherSong = new Song("Eric", "eric's Anthem", "Debut Album", "Rock");

        System.out.println("my favoite song is " + mySong.getTitle() + " by " + mySong.getArtist());

        House house1 = new House("brick");
        House house2 = new House("viny siding");

        System.out.println("House 1 has " + house1.getExteriorWallType());
        System.out.println("House 2 has " + house2.getExteriorWallType());


    }
}
