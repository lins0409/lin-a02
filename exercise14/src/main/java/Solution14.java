/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Objects;
import java.util.Scanner;

/*
 *pseudo code
 *Write a simple program to compute the tax on an order amount. The program should prompt for the order amount and the state. If the state is WI, then the order must be charged 5.5 tax. The program should display the subtotal, tax, and total for Wisconsin residents but display just the total for non-residents.
 *  -prompt for the order amount, store the value
 *  -prompt for the state
 *      -if the state is WI, then multiply the amount by 5.5
 *          -display the subtotal, tax, and total for WI only
 *   -display only the total otherwise
 */

public class Solution14 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution14 sol = new Solution14();

        System.out.print("What is the order amount?: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.print("What is the state?: ");
        String state = scanner.nextLine();

        if ( state.equals("WI")){
            sol.Wisconsin(amount);
            return;
        }

        sol.otherStates(amount);
    }

    void Wisconsin(int amount){
        double tax = amount * (5.5 / 100);
        double total = amount + tax;
        System.out.printf("The subtotal is $%.2f.\n", (float) amount);
        System.out.printf("The tax is $%.2f.\n", (float) tax);
        System.out.printf("The total is $%.2f.", (float) total);
    }

    void otherStates(int amount){
        System.out.printf("The total is $%.2f.", (float) amount);
    }
}
