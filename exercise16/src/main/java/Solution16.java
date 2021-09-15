/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
* pseudo code
* Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
*   -prompt for user age and store value
*   -compare the value to the legal age of 16
*   -if it is less
*       -print out that they are not old enough to legally drive
*   -if it is more or equal to
*       -print out that they are legally able to drive
 */

public class Solution16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution16 sol = new Solution16();

        System.out.print("What is your age?: ");
        int age = Integer.parseInt(scanner.nextLine());

        sol.ternaryOp(age);
    }

    void ternaryOp(int age){
        int legal = 16;

        String result = (age >= legal) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);
    }
}

