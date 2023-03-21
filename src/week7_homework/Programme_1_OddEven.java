package week7_homework;
/*1. Write a java program that tells us that Input number is odd or even?*/

import java.util.Scanner;

public class Programme_1_OddEven {
    public static void main(String[] args) {
        //
                oddEven();                  // Static method
    }
    public static void oddEven(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        if(number %2 ==0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + "is Odd Number");
        }
        scan.close();
    }











}
