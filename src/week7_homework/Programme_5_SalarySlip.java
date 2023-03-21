package week7_homework;

import java.util.Scanner;

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        salarySlip();                                               // static method
    }

    public static void salarySlip(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Employee Id");
        int eId= scan.nextInt();
        System.out.println("Enter the Employee Name");
        String eName = scan.next();
        System.out.println("Enter the Basic salary:");
        double salary = scan.nextDouble();
        double hra =  (salary*10)/100;
        double ta  =  (salary*8)/100;
        double da  =  (salary*9)/100;
        double pf  =  (salary*20)/100;
        double grossSalary = (salary+hra+ta+da)-pf;
        scan.close();

        System.out.println("|---------------------------------------------|");
        System.out.println("|                  Salary Slip                |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|Employee ID       : "+eId+"                   |");
        System.out.println("|Employee Name     : "+eName+"                 |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|Basic Salary      : "+salary+"               |");
        System.out.println("|HRA 10%           : "+hra+"                  |");
        System.out.println("|TA 8%             : "+ta+"                   |");
        System.out.println("|DA 9%             : "+da+"                   |");
        System.out.println("|PF 20%            : "+pf+"                   |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|Gross salary      : "+grossSalary+"          |");
        System.out.println("|---------------------------------------------|");
    }



}
