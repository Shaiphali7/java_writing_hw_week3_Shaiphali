package java_week_3_writing_hw_Shaiphali;

import java.util.Scanner;

/**
 * Write a java program input seller id, sellers name, sales amount, and basic salary
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt; 10,000 2%
 *
 */
public class Programme_7_SalesCommission
{
    public static void main(String[] args) {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller Name: ");
        String name=scanner.next();
        System.out.println("Enter seller Id: ");
        int sellerId=scanner.nextInt();
        System.out.println("Enter sale amount");
        int saleAmount=scanner.nextInt();
        System.out.println("Enter basic salary");
        int basicSalary=scanner.nextInt();
        Programme_7_SalesCommission salesCommission=new Programme_7_SalesCommission();
        int grossSalary =basicSalary+salesCommission.calculateCommission(saleAmount);
        System.out.println("Seller name is             :"+name);
        System.out.println("Seller id is               :"+sellerId);
        System.out.println("Seller's sales amount is  :"+saleAmount);
        System.out.println("Seller basic salary       :"+basicSalary);
        System.out.println("Seller id is              :"+grossSalary);
        scanner.close();
        
    }
    //Calculating sale commission
public int calculateCommission(int salesAmount){
        int comission;
        if(salesAmount>=5000){
            comission=(salesAmount*35)/100;
            System.out.println("Sale Commission is "+comission);
        } else if (salesAmount>=30000) {
            comission=(salesAmount*20)/100;
            System.out.println("sale commission is "+comission);
        } else if (salesAmount >=20000){
            comission=(salesAmount*10)/100;
            System.out.println("sales commission is "+comission);
        } else if (salesAmount >=10000){
            comission=(salesAmount*5)/100;
            System.out.println("sales commission is "+comission);
        }else{
            comission=(salesAmount*2)/100;
            System.out.println("sales commission is "+comission);
        }
return comission;
}

}

