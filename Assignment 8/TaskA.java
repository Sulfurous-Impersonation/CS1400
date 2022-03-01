//Steven Watson
//CS 1400
//Assignment 8
//March 12, 2021
import java.util.*;

public class TaskA
{
    public static void main (String[] args)
    {
        System.out.println("Testing recursive numberCount method\n");
        
        int[] test = {0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3};
        System.out.println("Searching for 3s in test array: " + Arrays.toString(test)
            + "\n # 3s in test array: " + numberCount(test, 3));
    }
    
    public static int numberCount(int[] array, int toCount)
    {
        int count = 0;
        if (array[0] == toCount)
            count = 1;

        if(array.length == 1)
            return count;
        int[] subArray = new int[array.length-1];
        for (int i = 0; i < subArray.length; i++)
            subArray[i] = array[i+1];
        
        count += numberCount(subArray, toCount);
        return count;
    }
}