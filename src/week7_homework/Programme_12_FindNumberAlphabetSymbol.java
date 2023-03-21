package week7_homework;
/*
12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme_12_FindNumberAlphabetSymbol {
    public static void main(String[] args) {
        Programme_12_FindNumberAlphabetSymbol input = new Programme_12_FindNumberAlphabetSymbol();
        input.findValue();
    }
    public void findValue(){                         //instance method
        Scanner scan = new Scanner(System.in);      //scanner use
        System.out.println("Enter the number of Alphabet or Symbol : ");    //print statement
        char value = scan.next().charAt(0);
        if ((value >= 'A' && value <= 'Z') || (value >='a' && value<= 'Z')){
            System.out.println("this is an aphabet");

        } else if (value >='0' && value<= '9') {
            System.out.println("this is a number");
        }else {
            System.out.println("this is a symbol");
        }
        scan.close();

    }
}
