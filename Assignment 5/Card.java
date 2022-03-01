//Steven Watson
//CS1400
//Assignment 5
//April 5, 2021

public class Card
{
    private String myFace;
    private int myValue;
    private String mySuit;

    public Card ()
    {
        myFace = "";
        myValue = 0;
        mySuit = "";
    }

    public Card (String face, int value, String suit)
    {
        myFace = face;
        myValue = value;
        mySuit = suit;
    }

    public String getFace ()
    {
        return myFace;
    }

    public int getValue ()
    {
        return myValue;
    }

    public String getSuit ()
    {
        return mySuit;
    }

    public boolean setFace (String face)
    {
        myFace = face;
        return true;
    }

    public boolean setValue (int value)
    {
        myValue = value;
        return true;
    }

    public boolean getSuit (String suit)
    {
        mySuit = suit;
        return true;
    }

    public String printCard ()
    {
        return myFace + " of " + mySuit;
    }
}