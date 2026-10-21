package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ConvertingStringsToDates {

    public static void main(String[] args) {


        //erics birthday from so long ago (iso 8601 format, the default)
        String stringDate = "1981-09-30";

        LocalDate myBirthday = LocalDate.parse(stringDate);

        //print out the converted date
        System.out.println("My birthday is " + myBirthday);

        //print out the day of the year by birthday is
        System.out.println("My birthday is on this day of the year " + myBirthday.getDayOfYear());

        //get the day of the month
        System.out.println("My birthday is on this day of the month " + myBirthday.getDayOfMonth());

        //get the year
        System.out.println("I was born in this year " + myBirthday.getYear());

        System.out.println("\n\n ====== what if we want the day in a different format =====");

        //create a date formatter for how we expect users to give us the date
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter displayFormatter2 = DateTimeFormatter.ofPattern("MMM-dd-yy");


        //date formatted as MM/dd/yyyy
        String formattedDateString = "10/20/2022";


        LocalDate formattedDate = LocalDate.parse(formattedDateString,  inputFormatter);

        //get the day of the month
        System.out.println("The date is on this day of the month " + formattedDate.getDayOfMonth());

        //get the year
        System.out.println("the year of the date was " + formattedDate.getYear());

        //use a formatter for the display of a year
        System.out.println(formattedDate); //uses the iso format when displaying regardless of the input format
        System.out.println(formattedDate.format(displayFormatter)); //display it how we want using a cusomt displayformatter we created
        System.out.println(formattedDate.format(displayFormatter2));

        //get the date right now
        LocalDate theDateRightNow  = LocalDate.now();

        //get the date and time right now (you will use this the most)
        LocalDateTime theDateAndTimeRightNow  = LocalDateTime.now();

        //get just the time
        LocalTime theTimeRightNow = LocalTime.now();



    }

}
