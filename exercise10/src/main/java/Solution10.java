/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
* pseudo code
* Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
*   -initialize scanner
*   -prompt for item price, store it in a variable
*   -prompt for quantity, store in a variable
*   -prompt for price of 2nd item, store it
*   -prompt for quantity of second item, store it
*   -prompt for 3rd item price, store it in a variable
*   -prompt for quantity, store in a variable
*   -add all of the quantity * their price together
*   -multiply the sum by the tax rate and store the value
*   -display the subtotal and tax
*   -add subtotal and tax together to get the total
 */

public class Solution10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution10 sol = new Solution10();

        System.out.println("Enter the price of item 1: ");
        int priceOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the quantity of item 1: ");
        int quantOne = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the price of item 2: ");
        int priceTwo = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the quantity of item 2: ");
        int quantTwo = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the price of item 3: ");
        int priceThree = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the quantity of item 3: ");
        int quantThree = Integer.parseInt(scanner.nextLine());

        sol.sum(priceOne, quantOne, priceTwo, quantTwo, priceThree, quantThree);

    }

    void sum (int oneP, int oneQ, int twoP, int twoQ, int threeP, int threeQ){
        int first = oneP * oneQ;
        int second = twoP * twoQ;
        int third = threeP * threeQ;
        double total = first + second + third;

        System.out.println("Subtotal: $" + total);
        taxation(total);
    }

    void taxation (double sum){
        double tax = sum * 0.055;
        System.out.println("Tax: $" +tax);
        total(sum, tax);
    }

    void total (double sum, double tax) {
        double tot = sum + tax;
        System.out.println("Total: $" + tot);
    }
}
