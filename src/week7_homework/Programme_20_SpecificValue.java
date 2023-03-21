package week7_homework;
/*
20. Write a Java program to test if an array contains a specific value.
 */

public class Programme_20_SpecificValue {
    public static void main(String[] args) {
        int myArray [] = {10,20,30,40,50}; //declaring array

        arrySpecific(myArray, 80);
        System.out.println("Specific item is: "+arrySpecific(myArray, 80)); //output
    }
    public static boolean arrySpecific(int a[],int b){ // static method with parameter
        for(int i :a){
            if (b == i){
                return true;       // return value
            }
        }
        return false;
    }
}
