/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
* pseudo code
* Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.
*   -initialize scanner
*   -tell user to press C to go from fahrenheit to celsius or F for fahrenheit to celsius
*   -store the value to compare for later
*   -prompt for the starting temperature
*       -if read in value is c or C execute fahrenheit to celsius function
*       -if read in value is f or F execute celsius to fahrenheit function
*
*   fahrenheit to celsius function
*       -(temp - 32) * 5 / 9
*       -print out the value in celsius
*
*   celsius to fahrenheit function
*       -(temp * 9/5) + 32
*       -print out the value in fahrenheit
 */

public class Solution18 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution18 sol = new Solution18();

        int temperature;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        String choice = scanner.nextLine();
        System.out.printf("Your choice: %s\n", choice);

        if (choice.equals("c") || choice.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temperature = scanner.nextInt();
            sol.celsius(temperature);
        }
        else if (choice.equals("f") || choice.equals("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            temperature = scanner.nextInt();
            sol.fahrenheit(temperature);
        }
    }

    void celsius (int temp){
        int degree = (temp - 32) * 5 / 9;
        System.out.printf("The temperature in Celsius is %d.", degree);
    }

    void fahrenheit(int temp){
        int degree = (temp * 9 / 5) + 32;
        System.out.printf("The temperature in Fahrenheit is %d.", degree);
    }
}
