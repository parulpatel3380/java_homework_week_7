package week7_homework;
/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%


 */

import java.util.Scanner;

public class Programme_7_Commission {
    public static void main(String[] args) {
        Programme_7_Commission sales = new Programme_7_Commission();
        sales.salesCommission();
    }

    public void salesCommission(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sales Id :");
        int sId = scan.nextInt();
        System.out.println("Enter the Seller's Name:");
        String sName = scan.next();
        System.out.println("Enter the Sales Amount");
        double salesAmount = scan.nextDouble();
        System.out.println("Enter the basic salary:");
        double basicSalary = scan.nextDouble();
        double commission;

        if (salesAmount>=50000){
            commission = (basicSalary*35)/100;
            System.out.println("Commission:" +commission);
        }
        else if (salesAmount>=30000 && salesAmount<50000) {
            commission = (basicSalary * 20)/ 100;
            System.out.println("Commission:" +commission);
        }
        else if (salesAmount>=2000 && salesAmount<30000)
        {
            commission = (basicSalary * 10)/ 100;
            System.out.println("Commission:" +commission);
        }
        else if (salesAmount>=10000 && salesAmount<20000)
        {
            commission = (basicSalary * 5)/100;
            System.out.println("Commission:" +commission);
        }
        else if (salesAmount<10000)
        {
            commission = (basicSalary*2)/100;
            System.out.println("Commission:" +commission);

        }
        scan.close();

    }

    }




