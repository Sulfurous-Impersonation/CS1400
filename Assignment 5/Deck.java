//Steven Watson
//CS1400
//Assignment 5
//April 5, 2021
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck 
{
    private Card[] myCards;

    public Deck ()
    {
        myCards = new Card[52];
        int index = 0;

        String suit = "Spades";
        for (int i = 0; i < 4; i++)
        {
            //Determine Suit
            if (i == 1)
                suit = "Hearts";
            else if (i == 2)
                suit = "Diamonds";
            else if (i == 3)
                suit = "Clubs";
            
            //Determine value and add card to MyCards
            for (int j = 0; j < 13; j++)
            {
                Card toAdd;
                if(j < 9) //2-10
                    toAdd = new Card (j+2+"", j+2, suit);
                else if (j < 13) //Face Card
                {
                    if(j == 10)
                        toAdd = new Card ("Jack", 10, suit);
                    else if (j == 11)
                        toAdd = new Card ("Queen", 10, suit);
                    else
                        toAdd = new Card ("King", 10, suit);
                }
                else //Ace
                    toAdd = new Card ("Ace", 11, suit);
                
                myCards[index] = toAdd;
                index++;
            }
        }
    }

    public Card draw ()
    {
        //look at bottom card
        Card drawnCard = myCards[0];

        //remove card from deck
        Card[] temp = new Card[(myCards.length - 1)];
        for (int i = 0; i < temp.length; i++)
            temp[i] = myCards[i+1];
        myCards = temp;

        //return drawn card
        return drawnCard;
    }

    public void shuffle ()
    {
        Collections.shuffle(Arrays.asList(myCards));
    }
}