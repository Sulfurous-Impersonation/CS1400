//Steven Watson
//CS1400
//Assignment 7
//April 27th, 2021

public class Person
{
    private String myName;
    private int myAge;
    private String myFood;

    public Person()
    {
        myName = "";
        myAge = -1;
        myFood = "";
    }

    public Person(String name, int age, String food)
    {
        myName = name;
        myAge = age;
        myFood = food;
    }

    public Person(String name)
    {
        myName = name;
        myAge = -1;
        myFood = "";
    }

    public Person(Person person)
    {
        myName = person.getName();
        myAge = person.getAge();
        myFood = person.getFood();
    }

    public String getName()
    {
        return myName;
    }

    public boolean setName(String name)
    {
        myName = name;
        return true;
    }

    public int getAge()
    {
        return myAge;
    }

    public boolean setAge(int age)
    {
        myAge = age;
        return true;
    }

    public String getFood()
    {
        return myFood;
    }

    public boolean setFood(String food)
    {
        myFood = food;
        return true;
    }

    public boolean equals(Person person)
    {
        if (myName.equals(person.getName()) && myAge == person.getAge() 
            && myFood.equals(person.getFood()))
            return true;
        return false;
    }

    public String toString()
    {
        return "Name: " + myName + "\nAge: " + myAge 
        + "\nFavorite Food: " + myFood;
    }
}