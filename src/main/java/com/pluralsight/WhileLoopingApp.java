package com.pluralsight;

public class WhileLoopingApp {

    public static void main(String[] args) {

        //set some counter or variable to a number
        int i = 1;

        //while that number is less than 10, keep looping
        while (i <= 10) {

            //every time we loop, print something out
            System.out.println("we have looped " + i + " times");

            //everytime we loop, change the variable the condition is relying on
            i++;
        }

        //this do/while

        System.out.println("\n\n do while output ===");
        int n = 1;
        do {
            System.out.println("we have looped " + n + " times");
            n++;
        } while (n <= 10);


    }

}
