package week7_homework;
/*
11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */

public class Programme_11_PrintNumber {
    public static void main(String[] args) {
        Programme_11_PrintNumber divided = new Programme_11_PrintNumber();        //instance method
        divided.dividedThree();
        Programme_11_PrintNumber divided1 = new Programme_11_PrintNumber();
        divided1.dividedFive();
    }
    public void dividedThree(){       // divided 1 to 100 by 3
        System.out.println("Divided by 3 value: ");
        for (int i = 1; i < 100; i++)          // for loop
        {
            if (i % 3 ==0)
                System.out.println(i + ",");
        }
        //..

    }
    public void dividedFive()                                             //divided 1 to 100 by 5
    {
        System.out.println("  ");
        System.out.println("Divided by 5 value: ");
        for (int i = 1; i < 100; i++){
            if (i % 5 == 0)
                System.out.println(i+ ",");
        }
    }
}
