package org.learning.javainheritanceshop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many products will you add? ");
        int size = Integer.parseInt(scan.nextLine());

        Product[] products = new Product[size];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + (i+1));

            System.out.println("What type of product are you adding?\n" +
                    "1. Smartphone\n" + "2. TV\n" + "3. Headphones");
            String choice = scan.nextLine();

            System.out.print("Insert name: ");
            String name = scan.nextLine();

            System.out.print("Insert brand: ");
            String brand = scan.nextLine();

            System.out.print("Insert price: ");
            BigDecimal price = new BigDecimal(scan.nextLine());

            System.out.print("Insert vat: ");
            BigDecimal vat = new BigDecimal(scan.nextLine());

            switch (choice) {
                case "1":
                    System.out.print("Insert IMEI: ");
                    String IMEI = scan.nextLine();

                    System.out.print("Insert storage (GB): ");
                    int storage = Integer.parseInt(scan.nextLine());

                    Smartphone sm = new Smartphone(name, brand, price, vat, IMEI, storage);

                    products[i] = sm;
                    break;
                case "2":
                    System.out.print("Insert inches: ");
                    int inches = Integer.parseInt(scan.nextLine());


                    System.out.println("Is it smart? true/false");
                    boolean isSmart = scan.nextBoolean();

                    TV tv = new TV(name, brand, price, vat, inches, isSmart);

                    products[i] = tv;
                    break;
                case "3":
                    System.out.print("Insert color: ");
                    String color = scan.nextLine();

                    System.out.print("Is it wireless? true/false");
                    boolean isWireless = scan.nextBoolean();

                    Headphones hp = new Headphones(name, brand, price, vat, color, isWireless);

                    products[i] = hp;
                    break;
            }
        }

        BigDecimal totalVatPrice = BigDecimal.ZERO;

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + (i+1) + ": " + products[i].getDetails());
            totalVatPrice = totalVatPrice.add(products[i].getVatPrice());
        }

        System.out.println("Total VAT Price: " + totalVatPrice);

        scan.close();
    }
}
