/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;
/*
*pseudo code
* Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.
*   -prompt for number of euros for conversion
*   -store the value in a variable
*   -ask for what the exchange rate is and store the value
*   -multiply the rate by the number of euros
*   -print out the value
 */

public class Solution11 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many euros are you exchanging? ");
        int euros = (int) scanner.nextDouble();
        System.out.println("What is the exchange rate? ");
        double rate = scanner.nextDouble();

        Solution11 sol = new Solution11();
        sol.math(euros, rate);
    }

    void math (int amount, double rate){
        double exchange = amount * rate;
        System.out.println( amount + " euros at an exchange rate of " + rate + " is\n");
        System.out.printf("%.2f U.S dollars.", exchange);
    }
}
