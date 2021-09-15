/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
 *pseudo code
 * Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).
 *  -initialize scanner
 *  -prompt for principal and store the value
 *  -prompt for rate of interest as a percentage and store the value
 *  -prompt for the number of years and store the value
 *  -multiply the rate by the year, add one, and multiply it by the principal
 *      -this value is the amount
 *  -print out that in [blank] amount of years at a rate of [blank]%, the investment will be [blank]
 */

public class Solution12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution12 sol = new Solution12();

        System.out.println("Enter the principal: ");
        int prin = scanner.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();

        sol.investment(prin, rate, years);
    }
    void investment(int prin, double rate, int years){
        double percent = rate / 100;
        float amount = prin * (1 + ((float)percent * years));

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + Math.round(amount) + ".");
    }
}
