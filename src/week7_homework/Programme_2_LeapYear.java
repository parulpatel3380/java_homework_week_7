package week7_homework;
/*2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
*/

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isLeapYear();
    }
    public void isLeapYear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = scan.nextInt();
        if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + "is a Leap year");
        } else {
            System.out.println(year + "is not a Leap year");
        }
        scan.close();
    }
}
