/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
 * pseudocode
 * Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
 *   -initialize scanner so it can be used
 *   -Ask for length in feet
 *   -store length in a variable
 *   -ask for width in feet
 *   -store in a variable
 *   -get the area
 *   -divide the area by 350 feet, store results in a temp value
 *   -print out number of gallons required
 */

public class Solution09 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution09 sol = new Solution09();

        System.out.println("What is the length in feet? ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the width in feet? ");
        int width = Integer.parseInt(scanner.nextLine());


        double space = sol.area(length, width);
        double gallons = Math.ceil(space/350);

        System.out.println("You will need to purchase " + (int) gallons + " gallons of paint to cover " + (int) space + " square feet.");
    }

    int area (int len, int wid){
        return len * wid;
    }
}