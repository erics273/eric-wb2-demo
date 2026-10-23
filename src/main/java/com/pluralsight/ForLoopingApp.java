package com.pluralsight;

public class ForLoopingApp {

    public static void main(String[] args) {

        //this is the while loop for reference
//        int i = 1;
//        while (i <= 10) {
//            System.out.println("we have looped " + i + " times");
//            i++;
//        }

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("we have looped " + i + " times");
        }

        //only print something for even numbers
        for (int i = 1; i <= 10 ; i++) {

            if(i % 2 != 0){
              //  continue;
                System.out.println(i + " is odd");
                continue;
            }

            if(i == 8){
                break;
            }

            System.out.println(i + " is even so we are showing it");
        }

        for (int i = 1; i <= 10 ; i++) {

            if(i % 2 == 0){
                System.out.println(i + " is even so we are showing it");
            }

        }

    }

}
