/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

/*
 * pseudo code
 * Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.
 *  -prompt for the room in feet
 *  -use scanner to scan in the value and store it in a temp variable
 *  -ask foe the width in feet
 *  -scan in the values and store in a temp variable
 *  -print out what the length and width are
 *  -calculate the area in feet squared
 *  -calculate the area in meters squared
 */
public class Solution07 {
    //used to format the output in money form
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution07 sol= new Solution07();

        System.out.println("What is the length of the room in feet? ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the width of the room in feet? ");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.println("The area is \n");


        int area = sol.space(length, width);

        System.out.println(area + " square feet\n");
        double meters = sol.conversion(area);

        System.out.println( df2.format(meters)+ " square meters");
    }
    int space(int len, int wid)
    {
        return len * wid;
    }

    double conversion(int area) { return area * 0.09290304;}
}


