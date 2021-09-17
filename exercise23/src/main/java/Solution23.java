/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sue Lin
 */

import java.util.Scanner;

/*
* pseudocode
* Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build the system
*   -first put the thing into plantUML, so you can see what the heck is going on
*   -initialize scanner
*   -prompt user if the car is silent when they turn on the key
*       -if yes
*           -ask if the battery terminals are corroded
*               -if yes: Clean terminals and try starting again
*               -if no, replace cables and try again
*       -if no
*           -ask if the car makes a slicking noise
*               -if yes: tell them to replace the battery
*           -if no, ask if the car cranks up but fails to start
*               -if yes: check spark plug connections
*               -if no, ask if the engine starts then dies
*                   -if yes, ask if the car has fuel injection
*                       -if yes: tell them to get it in for service
*                       -if no: check to make sure that the choke is opening and closing
*                   -if no, then it should not be possible
 */

public class Solution23 {

    public static void main (String[] args){
        //Solution23 sol = new Solution23();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String input = scanner.nextLine();

        if(input.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            String in = scanner.nextLine();

            if(in.equals("y")){
                System.out.print("Clean the terminals and try starting again.");
            }
            else if (in.equals("n")){
                System.out.print("Replace cables and try again.");
            }
        }
        else if (input.equals("n")){
            System.out.print("Does the car make a slicking noise? ");
            String value = scanner.nextLine();

            if(value.equals("y")){
                System.out.print("Replace the battery.");
            }
            else if (value.equals("n")){
                System.out.print("Does the car crank up but fail to start? ");
                String answer = scanner.nextLine();

                if(answer.equals("y")){
                    System.out.print("Check spark plug connections.");
                }
                else if (answer.equals("n")){
                    System.out.print("Does the engine start and then die? ");
                    String ans = scanner.nextLine();

                    if(ans.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        String val = scanner.nextLine();

                        if (val.equals("y")){
                            System.out.print("Get it in for service.");
                        }
                        else if(val.equals("n")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if (ans.equals("n")){
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}
