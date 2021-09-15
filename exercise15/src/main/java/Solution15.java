/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
*pseudo code
*create a simple program that validates user login credentials. The program must prompt the user for a username and password.
*   -prompt user for their username and store the value
*   -prompt user for their password and store the value
*       -compare the user's password to the stored password
*           -if they match, print the welcome message
*           -else, print that you don't know them
 */

public class Solution15 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Solution15 sol = new Solution15();
        String password = "chonkcat1112";

        System.out.print("Enter your username: ");
        String user = scanner.nextLine();
        System.out.print("What is the password?: ");
        String pass = scanner.nextLine();

        if(user != null && pass.equals(password)){
            sol.correct();
        }
        else {
            sol.wrong();
        }
    }

    void correct(){
        System.out.print("Welcome!");
    }
    void wrong(){
        System.out.print("I don't know you.");
    }
}
