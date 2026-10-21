package com.pluralsight;


import java.util.Scanner;

public class StringBuilderDemo {

    public static void main(String[] args) {

        //lets create a string builder like we create a scanner
        StringBuilder theMessage = new StringBuilder();

        theMessage.append("Eric");
        theMessage.append(" ");
        theMessage.append("Schwartz");

        System.out.println(theMessage.toString());

        StringBuilder fullName = new StringBuilder();

        String firstName = "eric";
        String lastName = "schwartz";

        fullName.append(lastName);
        fullName.append(", ");
        fullName.append(firstName);

        System.out.printf("%s", fullName.toString());


    }

}
