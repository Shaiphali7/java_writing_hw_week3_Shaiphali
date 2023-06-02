package java_week_3_writing_hw_Shaiphali;
/**
 * Write a Java program to test if an array contains a specific
 * value.
 */
public class Programme_20_FindValueInArray
{
    public static void main(String[] args)
    {
        // Declaring the numeric array
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        System.out.println(isArrayContains(numArray, 2035));
        System.out.println(isArrayContains(numArray, 7999));
    }
    public static boolean isArrayContains(int []arr,int item)
    {
        boolean isContain=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                isContain=true;
                break;

            }

        }
    return isContain;
    }
}
