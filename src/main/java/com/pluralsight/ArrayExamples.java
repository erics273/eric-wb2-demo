package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        //create anb array of intergers that has 5 empty spots with a 0 as the value
        int[] myNymbers = new int[5];
        //add something to the first spot (index 0)
        myNymbers[0] = 1;
        //fill the rest of the spots
        myNymbers[1] = 24;
        myNymbers[2] = 3;
        myNymbers[3] = 5;
        myNymbers[4] = 65;

        System.out.println("length of myNumbers array: " + myNymbers.length);

        //all the things on myNumbers
        for (int i = 0; i < myNymbers.length; i++) {
            //print out the index and the number at that index in my array of numbers
            System.out.println("the number at index " + i + " is: " + myNymbers[i]);
        }

        //sum all the numbers on the list
        int sum = 0;
//        for (int i = 0; i < myNymbers.length; i++) {
//            //print out the index and the number at that index in my array of numbers
//            sum += myNymbers[i];
//        }
        //same but foreach
        for (int number : myNymbers) {
            sum += number;
        }
        System.out.println("The sum of the numbers is: " + sum);


        //create an array with values at the time it's created
        int[] myOthersNumbers = {1, 3, 4, 8, 9, 12};
        System.out.println("length of myOthersNumbers array: " + myOthersNumbers.length);

        //while loop for myOtherNumbers
        int j = 0;
        while (j < myOthersNumbers.length) {
            System.out.println("the number at index " + j + " is: " + myOthersNumbers[j]);
            j++;
        }

        //while loop for myOtherNumbers
        int n = 0;
        int product = 1;
        while (n < myOthersNumbers.length) {
            product *= myOthersNumbers[n];
            n++;
        }

        System.out.println("The product of the numbers is: " + product);


        //array of strings
        String[] names = {"eric", "messie", "nathan", "raymond", "mark"};

        //display before sort
        displayNamesFromArray(names);

        //sort the names
        Arrays.sort(names);

        //print again
        displayNamesFromArray(names);

        //affirmations
        String[] affirmations = {"awesome", "cool", "literal the best", "the bees knees", "the best software engineer"};

        //print out the name with a random affirmation
        for(String name : names){
            //use getRandomNumber to pull an affiramtion from our array
            System.out.println(name + " is " + affirmations[getRandomNumber(0, affirmations.length-1)]);
        }

        //print out just nathan
        System.out.println(names[2]);


        //used our method that takes an array as a paramert by passing it our method that returns a list
        displayNamesFromArray(getListOfNames());


        String[] colors = {"red", "white", "blue"};
        String[] colors2 = new String[3];

        System.out.println( Arrays.toString(colors) );

        System.out.println( Arrays.toString(colors2) );

        colors2 = colors;

        System.out.println( Arrays.toString(colors2) );

        colors[1] = "pink";

        System.out.println( Arrays.toString(colors) );

        System.out.println( Arrays.toString(colors2) );


    }

    //use this to get a random number
    public static int getRandomNumber(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    //generic method to display our names
    public static void displayNamesFromArray(String[] names){
        //loop over the passed in array
        for(String name : names){
            System.out.println(name);
        }
    }

    //method that returns an array
    public static String[] getListOfNames(){
        String[] names = {"bob", "sally"};
        return names;
    }






}
