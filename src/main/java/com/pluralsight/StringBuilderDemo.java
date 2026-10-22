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


        // create a StringBuilder object
        StringBuilder skills = new StringBuilder();
// append strings to the StringBuilder object

        skills.append("\n\n");
        skills.append("Git, ");
        skills.append("HTML, ");
        skills.append("CSS, ");
        skills.append("and Bootstrap\n");
        skills.append("JavaScript, ");
        skills.append("ES6, ");
        skills.append("jQuery, ");
        skills.append("REST APIs, ");
        skills.append("and Express\n");
        skills.append("Angular\n");
        skills.append("Java\n");
// retrieve the underlying characters from
// the StringBuilder
        String mySkills = skills.toString();

        System.out.println(skills);



    }

}
