/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */
import java.util.Calendar;
import java.util.Scanner;
/*
 * pseudo code
 * Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output
 *   -ask for current age
 *   -create scanner variable to be used to scan in value
 *   -accept the value, store it in a temp variable
 *   -ask for age they want to retire
 *   -accept value, store it in a temp variable
 *   -subtract the age they are from the age they wish to retire and store the value in a variable
 *   -display the variable
 *   -display the year and add the difference to the year
 *
 */

public class Solution06{
    //do i have to keep this as a main??? can't i name it a different function so it can run?
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Solution06 sol = new Solution06();

        System.out.println("What is your current age? ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("At what age would you like to retire? ");
        int retire = Integer.parseInt(scanner.nextLine());
        int diff = sol.sub(age, retire);
        System.out.println("You have " + diff + " years left until you can retire\n");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int sum = sol.math(year, diff);
        System.out.println("It's " + year + ", so you can retire in " + sum);
    }

    int math(int year, int diff){
        return year + diff;
    }
    int sub(int age, int retire){
        return retire - age;
    }
}