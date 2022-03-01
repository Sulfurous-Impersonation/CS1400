//Steven Watson
//CS1400
//Assignment 5
//April 5, 2021
import java.util.ArrayList;

public class Hand 
{
    private ArrayList<Card> myHand;

    public Hand ()
    {
        myHand = new ArrayList<Card>();
    }

    public Hand (Card card1, Card card2)
    {
        myHand = new ArrayList<Card>();
        myHand.add(card1);
        myHand.add(card2);
    }

    public int addCard (Card toAdd)
    {
        myHand.add(toAdd);
        return calculate();
    }

    public int calculate ()
    {
        int sum = 0;
        for (int i = 0; i < myHand.size(); i++)
            sum += (myHand.get(i)).getValue();
        return sum;
    }

    public ArrayList<Card> getHand()
    {
        return myHand;
    }

    public Card getCardAt(int i)
    {
        return myHand.get(i);
    }
}