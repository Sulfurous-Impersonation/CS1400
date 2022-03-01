//Steven Watson
//CS1400
//Assignment 7
//April 27th, 2021

public class SuperHero extends Person
{
    private String myPower;
    private String myPhrase;
    static int totalNumberVillainsCaught;

    public SuperHero()
    {
        super();
        myPower = "";
        myPhrase = "";
    }

    public SuperHero(String name, int age, String food, String power, String phrase)
    {
        super(name, age, food);
        myPower = power;
        myPhrase = phrase;
    }

    public SuperHero(String name, String power, String phrase)
    {
        super(name);
        myPower = power;
        myPhrase = phrase;
    }

    public String getPower()
    {
        return myPower;
    }

    public boolean setPower(String power)
    {
        myPower = power;
        return true;
    }

    public String getPhrase()
    {
        return myPhrase;
    }

    public boolean setPhrase(String phrase)
    {
        myPhrase = phrase;
        return true;
    }

    public void speak()
    {
        System.out.println(myPhrase);
    }

    public boolean catchVillain()
    {
        totalNumberVillainsCaught++;
        return true;
    }

    public int villainsCaught()
    {
        return totalNumberVillainsCaught;
    }

    public String toString()
    {
        return super.toString() + "\nSuperpower: " + myPower 
        + "\nCatchphrase: " + myPhrase + "\n# Villains Caught: " + totalNumberVillainsCaught;
    }
}