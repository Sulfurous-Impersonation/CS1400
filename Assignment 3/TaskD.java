//Steven Watson
//CS 1400
//Assignment 3
//February 24th, 2021

import java.util.Scanner;

public class TaskD
{
    //Making Shortbread
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many shortbreads do you want to make?: ");
        double shortbread = keyboard.nextDouble()/24.0;
        double ozButter = shortbread * 4, ozSugar = shortbread * 2, ozFlour = shortbread * 6;
        
        System.out.println("Recipe for " + (int)(shortbread*24) + " shortbread (butter, sugar, flour):");
        System.out.printf("Oz:%7.2f\n", ozButter);
        System.out.printf("Oz:%7.2f\n", ozSugar);
        System.out.printf("Oz:%7.2f\n", ozFlour);
    }
}
