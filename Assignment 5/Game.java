//Steven Watson
//CS1400
//Assignment 5
//April 5, 2021
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Game 
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String input = "y";
        while (input.compareTo("y") == 0)
        {
            Deck deck = new Deck();
            deck.shuffle();
            Card card1 = deck.draw();
            Card card2 = deck.draw();
            Hand playerHand = new Hand(card1, card2);

            boolean playerStood = false;

            header();
            System.out.println("Your hand is:");
            displayHand(playerHand);

            while (!playerStood)
            {
                System.out.print("Do you want to stand or hit (s/h)? ");
                input = keyboard.nextLine();
                System.out.println();

                if (input.compareTo("s") == 0)
                    playerStood = stand(deck, playerHand);
                else if (input.compareTo("h") == 0)
                    playerStood = hit(deck, playerHand);
                else
                    System.out.println("Invalid input, please only type in s or h");
            }

            System.out.print("Do you want to play again (y/n)? ");
            input = keyboard.nextLine();
            System.out.println("\n\n");
        }
        keyboard.close();
    }

    private static void header()
    {
        String asterisks = "";
        for (int i = 0; i < 34; i++)
            asterisks += "*";
        System.out.printf("%-10s\n", asterisks);
        System.out.printf("%-10s\n", "* Welcome to the Blackjack Table *");
        System.out.printf("%-10s\n", asterisks);
        System.out.println();
    }

    private static void displayHand(Hand hand)
    {
        ArrayList<Card> temp = hand.getHand();

        //System.out.println("Your hand is:");
        for (int i = 0; i < temp.size(); i++)
            System.out.println(hand.getCardAt(i).printCard());
        System.out.println("<" + hand.calculate() + " points>\n");
    }

    public static boolean stand (Deck deck, Hand hand)
    {
        Card c1 = deck.draw();
        Card c2 = deck.draw();
        Hand dealerHand = new Hand(c1, c2);

        System.out.println("The dealer's hand is:");
        displayHand(dealerHand);
        compareHands(hand, dealerHand);
        return true;
    }

    public static boolean hit (Deck deck, Hand hand)
    {
        Card c = deck.draw();
        hand.addCard(c);

        System.out.println("Your hand is:");
        displayHand(hand);

        if (hand.calculate() > 21)
        {
            System.out.println("Bust!\n\nThe dealer wins!\n");
            return true;
        }
        if (hand.calculate() == 21)
        {
            return stand(deck, hand);
        }
        return false;
    }

    public static void compareHands (Hand playerHand, Hand dealerHand)
    {
        if (dealerHand.calculate() >= playerHand.calculate())
            System.out.println("The dealer wins!");
        else
            System.out.println("You win!");
    }
}