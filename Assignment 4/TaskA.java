//Steven Watson
//CS 1400
//Assignment 4
//March 8th, 2021

import java.util.Scanner;

public class TaskA 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String scoreBar[] = new String[5];
        for(int i = 0; i < 5; i++)
            scoreBar[i] = "";

        int score[] = new int[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter user " + (i+1) + " highscore: ");
            score[i] = keyboard.nextInt()/1000;
            keyboard.nextLine();

            for(int j = 0; j < score[i]; j++)
            {
                scoreBar[i] += "*";
            }
        }

        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("User " + (i+1) + ": " + scoreBar[i]);
        }
    }
}