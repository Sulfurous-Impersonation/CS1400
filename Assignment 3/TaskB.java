//Steven Watson
//CS 1400
//Assignment 3
//February 24th, 2021

import java.util.Scanner;

public class TaskB
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String[] names = new String[3];
        int[] times = new int[3];

        for(int i = 0; i < 3; i++)
        {
            System.out.print("Skier " + (i+1) + " name: ");
            names[i] = keyboard.nextLine();
            System.out.print("Skier " + (i+1) + " time: ");
            times[i] = keyboard.nextInt();
            keyboard.nextLine();
        }

        int a = -1, b = -1, c = -1;
        
        if(times[0] < times[1] && times[0] < times[2])
        {
                a = 0;
                if(times[2] < times[1])
                {
                    b = 2;
                    c = 1;
                } else {
                    c = 2;
                    b = 1;
                }

        }
        else if (times[0] < times[1])
        {
            //times[0] < times[1] && times[2] <= times[0]
            a = 2;
            b = 0; 
            c = 1;
        }
        else if(times[0] < times[2])
        {
            //times[0] < times[2] && times[1] <= times[0]
            a = 1;
            b = 0;
            c = 2; 
        } 
        else 
        {
            //times[2] <= times[0] && times[1] <= times[0]
            c = 0;
            if(times[1] < times[2])
            {
                a = 1;
                b = 2;
            } else {
                a = 2;
                b = 1;
            }
        }
            
        String[] orderedNames = new String[3];
        orderedNames[0] = names[a];
        orderedNames[1] = names[b];
        orderedNames[2] = names[c];

        for(int i = 0; i < 3; i++)
            System.out.println((i+1) + ": " + orderedNames[i]);
    }
}