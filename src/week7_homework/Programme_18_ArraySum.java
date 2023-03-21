package week7_homework;
/*
18. Write a Java program to sum values of an array.
 */

import java.util.Arrays;

public class Programme_18_ArraySum {
    public static void main(String[] args) {
        Programme_18_ArraySum value = new Programme_18_ArraySum(); // instance method calling using obj creation
        value.arrayAddition();
    }
    public void arrayAddition()
    {
       int [] number = {4,5,6,10,30};      //Array declaration
       int sum = Arrays.stream(number).sum();
        System.out.println("Sum of Array :" +sum);
    }
}
