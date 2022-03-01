//Steven Watson
//CS 1400
//Assignment 8
//March 12, 2021

public class TaskB 
{
    public static void main (String[] args)
    {
        System.out.println("Testing recursive sum method\n");
        System.out.println("Testing 4, expected sum 10"
            + "\nreturned value: " + sum(4));
    }

    public static int sum (int endVal)
    {
        if (endVal == 0)
            return 0;
        return endVal + sum(endVal-1);
    }
}