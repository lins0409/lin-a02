/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
*pseudo code
* Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula
*   -prompt for is the user is male or female
*       -store the results in a variable to be used for later
*   -prompt user for how many ounces of alcohol they consumed and store the value
*   -prompt user for their weight in pounds and store the value
*   -prompt user for the hours past since their last drink
*   -call function to calculate BAC
*
* BAC calculator
*   -take in amount of alcohol, weight, and sex
*   -if female
*       -ratio is 0.66
*       -calculate (ounces * 5.14 / weight * ratio) - 0.015 * hours past
*   -if male
*       -ratio is 0.73
*       -calculate (ounces * 5.14 / weight * ratio) - 0.015 * hours past
*   -print out the results
*   -compare the results to the legal amount of 0.08
*       -if more, print out it is not legal for them to drive
*       -if less, print out it is legal for them to drive
*
 */

public class Solution17 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution17 sol = new Solution17();

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int sex = scanner.nextInt();
        System.out.print("How many ounces of alcohol did you have?: ");
        int ounces = scanner.nextInt();
        System.out.print("What is your weight, in pounds?: ");
        int weight = scanner.nextInt();
        System.out.print("How many hours has it been since your last drink?: ");
        int time = scanner.nextInt();

        sol.BAC(sex, ounces, weight, time);
    }

    void BAC(int r, int oz, int lb, int hours){
        double ratio;
        double legal = 0.08;

        if( r == 1){
            ratio = 0.73;
            double level = (oz * 5.14 / lb * ratio) - 0.015 * hours;
            System.out.printf("Your BAC is %f\n", (float)level);

            String results = (level >= legal) ?"It is not legal for you to drive." : "It is legal for you to drive.";
            System.out.println(results);
        }
        else if (r == 2){
            ratio = 0.66;
            double level = (oz * 5.14 / lb * ratio) - 0.015 * hours;
            System.out.printf("Your BAC is %f\n", (float)level);

            String results = (level >= legal) ?"It is not legal for you to drive." : "It is legal for you to drive.";
            System.out.println(results);
        }
    }
}
