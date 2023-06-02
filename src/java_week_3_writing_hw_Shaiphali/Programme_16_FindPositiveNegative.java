package java_week_3_writing_hw_Shaiphali;

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //Scanner declartion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        findNumberIsPositiveOrZeroOrNegative(number);
        scanner.close();
    }

    //Finding the number is positive negative or zero
    public static void findNumberIsPositiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");

        }
        else if (number <0){
            System.out.println(number + " is a Negative number");

        }
        else
        {
            System.out.println(number + " is Zero");

        }
    }
}
