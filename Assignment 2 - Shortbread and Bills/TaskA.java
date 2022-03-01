//Steven Watson
//CS 1400
//Assignment 2
//February 15th, 2021

import java.util.Scanner;

public class TaskA
{
    //Making Shortbread
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many shortbreads do you want to make?: ");
        double shortbread = keyboard.nextDouble()/24.0;
        double gramsButter = shortbread * 125, gramsSugar = shortbread * 55, gramsFlour = shortbread * 180;
        double ozButter = shortbread * 4, ozSugar = shortbread * 2, ozFlour = shortbread * 6;
        
        System.out.println("You will need:");
        System.out.println("- " + (gramsButter) + "g/" + (ozButter) + "oz butter");
        System.out.println("- " + (gramsSugar) + "g/" + (ozSugar) + "oz sugar");
        System.out.println("- " + (gramsFlour) + "g/" + (ozFlour) + "oz flour");
    }
}