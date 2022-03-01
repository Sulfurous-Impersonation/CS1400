//Steven Watson
//CS 1400
//Assignment 4
//March 8th, 2021

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskB 
{
   public static void main (String[] args)
   {
      try 
      {
         File file = new File("spells.txt");
         Scanner scan = new Scanner(file);

         int line = 1;
         String data = "";
         while(scan.hasNextLine())
         {
            data = scan.nextLine();
            System.out.println("Line " + line + ": " + data);
            line++;
         }
         scan.close();
      }
      catch (FileNotFoundException e) 
      {
         System.out.println("File not found");
      }
   }
}