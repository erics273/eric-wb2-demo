package com.pluralsight;

import java.util.regex.Pattern;

public class ConvertingStrings {

    public static void main(String[] args) {

        System.out.println(" ===== simple example ======");

        //string we want to parse, maybe a line froma csv
        String inputFromCSV = "111|Hot Chocolate (12-count)|21|4.99";

        //this code takes the line and breaks it into pieces at the |
        String[] linePieces = inputFromCSV.split("\\|");

        //convert all the strings into their appropriate data types
        int id = Integer.parseInt( linePieces[0] );
        String description = linePieces[1];
        int quantity = Integer.parseInt( linePieces[2] );
        double price = Double.parseDouble( linePieces[3] );

        double inventoryTotalValue = quantity * price;

        System.out.println("We are rich with Hot chocolate, we have this much worth of it " + inventoryTotalValue);


        System.out.println();
        System.out.println(" ===== loopy example ======");

        //list of products
        String[] products = {
                "111|Hot Chocolate (12-count)|21|4.99",
                "112|Green Tea (20-count)|15|3.99",
                "113|Ground Coffee (12 oz)|18|8.99",
                "114|Chocolate Chip Cookies|24|5.49",
                "115|Granola Bars (6-count)|12|4.29",
                "116|Bottled Water (24-pack)|10|6.99",
                "117|Orange Juice (64 oz)|8|5.79",
                "118|Potato Chips (Family Size)|14|4.89"
        };

        //loop over each product inthe prodcts list
        for (String product : products) {

            //this code takes the line and breaks it into pieces at the |
            String[] productPieces = product.split(Pattern.quote("|"));

            //convert all the strings into their appropriate data types
            int productId = Integer.parseInt( productPieces[0] );
            String productDescription = productPieces[1];
            int productQuantity = Integer.parseInt( productPieces[2] );
            double productPrice = Double.parseDouble( productPieces[3] );

            double totalValue = productQuantity * productPrice;

            System.out.println("We are rich with " + productDescription + ", we have this much worth of it " + totalValue);


        }

    }

}
