//Steven Watson
//CS 1400
//Assignment 2
//February 15th, 2021

import java.util.Scanner;

public class TaskB
{
    //Splitting the Bill
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number of people in your party?: ");
        double numPartyMembers = keyboard.nextInt();

        System.out.print("And what was the total bill before tax and tip?: ");
        double preBill = keyboard.nextDouble(); //bill before adding tax and tip
        double totalBill = preBill * 1.20 + preBill * .0725; //total bill after tax and tip

        System.out.println("Each person in your group owes $" + (totalBill/numPartyMembers) + " after tax and tip");
    }
}