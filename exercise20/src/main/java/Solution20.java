/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
* pseudo code
*Create a tax calculator that handles multiple states and multiple counties within each state. The program prompts the user for the order amount and the state where the order will be shipped.
*   -initialize scanner
*   -prompt for order amount and store value
*   -prompt for state and store value
*       -if WI, run WI function
*       -if state is IL, run IL function
*       - else all other states get no charges
*       -display total
*
*   WI function
*           -ask for county
 *          -if Eau Claire, add extra 0.005 tax
 *          -if Dunn, add extra 0.004 tax
 *          -else charge for 0.05 tax
 *          -display tax and total
 *  IL function
 *          -charge for 0.008 tax
 *          -display tax and total
 */

public class Solution20 {
        public static void main (String [] args){
            Scanner scanner = new Scanner(System.in);
            Solution20 sol = new Solution20();
            double tax = 0;

            System.out.print("What is the order amount?: ");
            double amount = scanner.nextInt();
            scanner.nextLine();
            System.out.print("What state do you live in?: ");
            String state = scanner.nextLine();

            if(state.equals("WI") || state.equals("Wisconsin")){
                tax = sol.wisconsin(amount);
            }
            else if (state.equals("IL") || state.equals("Illinois")){
                tax = sol.illinois(amount);
            }

            double total = amount + tax;
            System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax, total);
        }

        double wisconsin(double am){
            double tax = am * 0.05;
            double extra = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.print("What county do you live in?: ");
            String county = scanner.nextLine();

            if(county.equals("Eau Claire")){
                extra = am * 0.005;
            }
            else if (county.equals("Dunn")){
                extra = am * 0.004;
            }

            tax += extra;

            return tax;
        }

        double illinois(double am){
            return am * 0.08;
        }
}
