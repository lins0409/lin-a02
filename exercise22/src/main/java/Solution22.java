/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
*pseudo code
* Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.
*   -initialize scanner
*   -prompt for 3 numbers, store each value in a seperate int
*   -check to see if the numbers are the same, if they are then exit the program
*       -if not, find the largest number
 */

public class Solution22 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution22 sol = new Solution22();

        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the third number: ");
        int third  = scanner.nextInt();

        sol.checkSeeIfSame(first, second, third);
        sol.findLargest(first, second, third);
    }

    void checkSeeIfSame(int one, int two , int three){
        if ( (one == two) && (two == three)){
            System.out.print("The numbers are the same. Exiting program...");
            System.exit(0);
        }
    }

    void findLargest(int one, int two, int three){
        int largest = 0;
        if (one >= 1 && one >= three){
            largest = one;
        }
        else if (two >= one && two >= three){
            largest = two;
        }
        else {
            largest = three;
        }

        System.out.printf("The largest number is %d.", largest);
    }
}
