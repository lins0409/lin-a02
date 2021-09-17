/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
 * pseudo code
 * Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.
 *   -prompt for the amount of people
 *   -use scanner to scan in new line, convert to int, store value
 *   -prompt for number of pizzas
 *   -scan in value, convert to in, store in value
 *   -prompt for number of slices
 *   -scan in value, convert to int, store value
 *   -display number of people and how many pizzas, put number of slices in parentheses
 *   -divide number of slices by people, store in an int
 *       -make sure the value is a whole number, and whatever is left over gets stored in a seperate value
 *   -tell how many slices each person gets
 *   -tell how many leftover slices there are
 */

public class Solution08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution08 total = new Solution08();

        System.out.println("How many people? ");
        int people = Integer.parseInt(scanner.nextLine());

        System.out.println("How many pizzas do you have? ");
        int pizzas = Integer.parseInt(scanner.nextLine());

        System.out.println("How many slices per pizza? ");
        int slices_per = Integer.parseInt(scanner.nextLine());



        int tot = total.calculateSlices(slices_per, pizzas);
        System.out.println(people + " people with " + pizzas + " pizzas (" + tot + " slices)");

        int div = total.division(tot, people);
        System.out.println("Each person gets " + div + " pieces of pizza.");

        int mult = total.multiply(people, div);
        int remainder = tot - mult;

        System.out.println("There are " + remainder + " leftover pieces");
    }

    int calculateSlices(int slices, int pizzas){
        return pizzas * slices;
    }

    int division (int total, int people){
        return total / people;
    }

    int multiply (int people, int division){
        return people * division;
    }
}
