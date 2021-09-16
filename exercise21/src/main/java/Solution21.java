/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
*pseudo code
* Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.
*   -initialize scanner
*   -prompt user for the number of the month
*   -whatever number that is received will be directed towards a month
*       - 1 is jan, 2 is feb, 3 is march ,etc.
 */

public class Solution21 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution21 sol = new Solution21();

        System.out.print("Please enter the number of the month: ");
        int month = scanner.nextInt();
        sol.cases(month);
    }

    void cases(int month){
        String string;

        switch (month){
            case 1: string = "The name of the month is January.";
                break;
            case 2: string = "The name of the month is February.";
                break;
            case 3: string = "The name of the month is March.";
                break;
            case 4: string = "The name of the month is April.";
                break;
            case 5: string = "The name of the month is May.";
                break;
            case 6: string = "The name of the month is June.";
                break;
            case 7: string = "The name of the month is July.";
                break;
            case 8: string = "The name of the month is August.";
                break;
            case 9: string = "The name of the month is September.";
                break;
            case 10: string = "The name of the month is October.";
                break;
            case 11: string = "The name of the month is November.";
                break;
            case 12: string = "The name of the month is December.";
                break;
            default: string = "Error, invalid number. The number is outside of the range.";
        }

        System.out.println(string);
    }
}
