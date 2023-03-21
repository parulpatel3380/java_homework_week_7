package week7_homework;
/*
9. Same as above program-8 using switch statement.
*/

import java.util.Scanner;

public class Programme_9_AlphabetUsingSwitch {
    public static void main(String[] args) {
        Programme_9_AlphabetUsingSwitch number = new Programme_9_AlphabetUsingSwitch();
        number.alphabet();
    }

    public void alphabet(){
        Scanner scan = new Scanner(System.in);                            //scanner calling
        System.out.println("Enter one Alphabet from 'A' to 'F': ");       //print statement
        char ch = scan.next().charAt(0);                                 // value store
        switch (ch){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Birmingham");
                break;
            case 'C':
                System.out.println("Copenhagan");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Eindhoven");
                break;
            case 'F':
                System.out.println("Florence");
                break;
            default:
                System.out.println("Invalid Entry");
        }
        scan.close();
    }
}
