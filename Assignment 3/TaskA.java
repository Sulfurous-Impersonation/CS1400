//Steven Watson
//CS 1400
//Assignment 3
//February 24th, 2021

import java.util.Scanner;

public class TaskA
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number of shortbread packages purchased: ");
        int packages = keyboard.nextInt(), discount = 50;
        if(packages < 100)
        {
            discount = 40;
            if(packages < 50)
            {
                discount = 30;
                if(packages < 20)
                {
                    discount = 20;
                    if(packages < 10)
                    {
                        discount = 0;
                        System.out.println("Unfortunately, you are ineligible for a discount.");
                    }
                }
            }
        }
        if(discount > 0)
            System.out.println("Congratulations! You get a " + discount + "% discount!");
    }
}