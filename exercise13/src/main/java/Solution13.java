/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
 *pseudo code
 * Write a program to compute the value of an investment compounded over time. The program should ask for the starting amount, the number of years to invest, the interest rate, and the number of periods per year to compound.
 *  -initialize scanner
 *  -prompt for principal and store the value
 *  -prompt for rate of interest as a percentage and store the value
 *  -prompt for the number of years and store the value
 *  -prompt for the number of times the interest is compounded per year and store the value
 *  -call in seperate function to calculate the compound interest
 *
 * compound interest function
 *  -take in the principal, rate, years, and number of times it is compounded per year
 *  - add 1 to the rate/ compound year
 *  - ^ the value by the compound year * years invested
 *  -multiply the whole thing by the principal
 *  -print out the principal, invested at what percentage for however many years that's it's compounded for and print out the total amount in the end
 */

public class Solution13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution13 sol = new Solution13();

        System.out.println("What is the principal amount?: ");
        int prin = scanner.nextInt();
        System.out.println("What is the rate?: ");
        double rate = scanner.nextDouble();
        System.out.println("What is the number of years?: ");
        int years = scanner.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?: ");
        int times = scanner.nextInt();

        sol.compound(prin, rate, years, times);
    }

    void compound(int prin, double rate, int years, int times){
        double percent = rate / 100;
        double firstCalc = 1 + (percent/times);
        double exponent = times * years;
        double finalCalc = prin * Math.pow(firstCalc, exponent);

        System.out.print("$" + prin + " invested at " + rate + "% for " + years + " years compounded " + times+ "times per year is $");
        System.out.printf("%.2f" , (float) finalCalc);
    }
}
