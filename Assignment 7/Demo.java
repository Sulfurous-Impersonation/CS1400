//Steven Watson
//CS1400
//Assignment 7
//April 27th, 2021

import java.io.*;

public class Demo
{
    public static void main (String[] args)
    {
        Person jared = new Person ("Jared", 19, "Pizza");
        Person alex = new Person ("Alex", 32, "Steak");
        SuperHero wonderWoman = new SuperHero("Wonder Woman", 904, "Justice", "Super Strength and Super Speed", "Kablam");
        SuperHero batman = new SuperHero("Batman", 45, "Justice", "None", "I am the darkness");
        
        System.out.println("Testing person 1:\n" + jared);
        System.out.println("\nTesting person 2:\n" + alex);

        System.out.println();

        System.out.println("\nTesting superhero 1:\n" + wonderWoman);
        System.out.println("Testing villainsCaught(): " + wonderWoman.villainsCaught());
        System.out.println("\nTesting superhero 2:\n" + batman);
        System.out.println("Testing villainsCaught(): " + batman.villainsCaught());
        
        System.out.println();

        System.out.println("Person 1 equals person 2: " + jared.equals(alex));
        System.out.println("Superhero 1 equals superhero 2: " + wonderWoman.equals(batman));

        System.out.println();

        System.out.println("Superhero 1, speak:");
        wonderWoman.speak();
        System.out.println("Superhero 2, speak:");
        batman.speak();
    }
}