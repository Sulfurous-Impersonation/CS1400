//Steven Watson
//CS 1400
//Assignment 3
//February 28th, 2021

import java.util.Scanner;

public class TaskC
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Task C, enter an int: ");
        int position = keyboard.nextInt();

        switch(position)
        {
            case 1: 
                System.out.println("You won!");
                break;
            case 2:
            case 3:
                System.out.println("You were so close!");
                break;
            default:
                System.out.println("Time to train harder!");
        }
    }
}