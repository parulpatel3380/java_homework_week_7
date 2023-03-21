package week7_homework;
/*
17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme_17_ArrayString {
    public static void main(String[] args) {
        Programme_17_ArrayString value = new Programme_17_ArrayString();              // object creation
        value.numberArraySorting();                                              // instance
        System.out.println("   ");
        value.stringArraySorting();
    }
    public void numberArraySorting(){
        int a[] = {10,5,20,15,30,25,40,35};
        System.out.println("Before sorting value : " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Numeric array after sorting" + Arrays.toString(a));
    }
    public void stringArraySorting()
    {
        String names [] = {"Dhara","Hiral","Roma","Bhavika","Ishita","Akta"};
        System.out.println("Before sorting Names :" +Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("String array after sorting :"+Arrays.toString(names));

    }


}
