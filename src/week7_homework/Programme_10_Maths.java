package week7_homework;
/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
*/

import java.util.Scanner;

public class Programme_10_Maths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                                  //scanner use
        System.out.println("Enter the first value");                        // value enter
        int first = scan.nextInt();
        System.out.println("Enter the second value");
        int second = scan.nextInt();
        System.out.println("Enter the symbol like : '+','-','/','*' :");
        char symbol = scan.next().charAt(0);                               // value store
        scan.close();
        if (symbol == '+')                                                            //if- else condition
        {
            System.out.println("Addition of two number :" + (first + second));        // output
        }
        else if (symbol == '-')
        {
            System.out.println("Subtraction of two number:" + (first - second));
        }
        else if (symbol == '*')
        {
            System.out.println("Multiplication of two number :" + (first * second));
        }
        else if (symbol == '/')
        {

                System.out.println("Division of two number:" + (first / second));
            }
            else
            {
                System.out.println("Enter the correct Symbol");
            }

        }
    }

