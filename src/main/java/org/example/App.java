package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        String uichoice = sc.nextLine();

        System.out.println("What state do you live in? ");
        String uichoice = sc.nextLine();
        System.out.println("What county do you live in? ");
        String uichoice = sc.nextLine();
        System.out.println("The tax is $0.50. ");
        String uichoice = sc.nextLine();
        System.out.println("The total is $10.50. ");
        String uichoice = sc.nextLine();
        if (uichoice.matches("C")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            String uiftemp = sc.nextLine();
            float ftemp = Float.valueOf(uiftemp);
            float ctemp = (ftemp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + ctemp);

        }
        else if(uichoice.matches("F"))
            System.out.println("Please enter the temperature in Celsius: ");
        String uictemp = sc.nextLine();
        float ctemp = Float.valueOf(uictemp);
        float ftemp = (ctemp * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is " + ftemp);






    }
}