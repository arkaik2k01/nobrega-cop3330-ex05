package CH1;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Nobrega
 */

//Exercise 5 - Simple Math
//You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.
//
//Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:
//
//Example Output
//What is the first number? 10
//What is the second number? 5
//10 + 5 = 15
//10 - 5 = 5
//10 * 5 = 50
//10 / 5 = 2

//Constraints
//Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
//Keep the inputs and outputs separate from the numerical conversions and other processing.
//Generate a single output statement with line breaks in the appropriate spots.

//Challenges
//Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric. !!
//Don’t allow the user to enter a negative number. !!
//Break the program into functions that do the computations. !!
//Implement this program as a GUI program that automatically updates the values when any value changes.

import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App prog = new App();

        //Input
        System.out.print("What is the first number? ");
        String num1 = in.nextLine();
        //Convert to int, check negative
        int n1 = prog.toInt(num1);

        System.out.print("What is the second number? ");
        String num2 = in.nextLine();
        //Convert to int, check negative
        int n2 = prog.toInt(num2);

        prog.printOutput(n1, n2);
    }

    private int toInt(String s)
    {
        if(Integer.valueOf(s) < 0)
        {
            while (Integer.valueOf(s) < 0)
            {
                System.out.print("Your number is a negative number. Please input a positive number: ");
                s = in.nextLine();
            }
        }
        return Integer.valueOf(s);
    }

    private void printOutput(int n1, int n2)
    {
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }
}
