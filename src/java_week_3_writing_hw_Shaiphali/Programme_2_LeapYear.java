package java_week_3_writing_hw_Shaiphali;

import java.util.Scanner;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear
{
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year=s.nextInt();
        Programme_2_LeapYear leapYear=new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        s.close();
    }
    public void isItLeapYear(int year)
    {
        if(year%4==0 && year % 100 != 0 || year %400==0) {
            System.out.println("The year " + year + " is the leap year");
            return;
        }
        System.out.println("This year "+year+" is not a leap year");
    }

}
