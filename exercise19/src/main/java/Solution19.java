/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
*pseudo code
* Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.
*   -initialize scanner
*   -prompt for their height in inches and store the value
*   -prompt for their weight in pounds and store the value
*      -run the BMI calculator
*
*   BMI calculator function
*       -take in height and weight
*       -bmi = (weight / (height * weight)) * 703
*       -if it is between 18.5 and 25 display that they are a normal weight
*           -else, if they are less say that they are underweight
*           -if they are over say that they are overweight
*           -tell them to consult a doctor for either of those
 */

public class Solution19 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution19 sol = new Solution19();

        System.out.println("What is your height in inches?: ");
        //this is the loop that ensures it keeps repeating until an int is entered
        while(!scanner.hasNextInt()){
            scanner.next();
        }
        int height = scanner.nextInt();
        System.out.println("What is your weight in pound??: ");
        int weight = scanner.nextInt();

        sol.BMI(height, weight);
    }

    void BMI(int h, int w){
        double heightSquared = h * h;
        double value = (w / heightSquared) * 703;
        System.out.printf("Your BMI is %.1f.\n", value);

        if (value >= 18.5 && value <=25){
            System.out.print("You are within the ideal weight range.");
        }
        else if (value > 25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else if (value < 18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }
    }
}
