package week7_homework;
/*

6. Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme_6_EvenOdd {
    public static void main(String[] args) {
        Programme_6_EvenOdd num = new Programme_6_EvenOdd();
        num.isOddEven();

    }

    public void isOddEven() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }
        scan.close();
    }
}




