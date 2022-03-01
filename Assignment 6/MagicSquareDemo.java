//Steven Watson
//CS1400
//Assignment 6
//April 12, 2021

public class MagicSquareDemo 
{
    public static void main (String[] args)
    {
        MagicSquare checker = new MagicSquare();
        System.out.println("Testing MagicSquare class\n");
        
        System.out.println("Testing magic square (all values are 3):");
        int[][] magic = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                magic[i][j] = 3;
        System.out.println("It is a magic square? " + checker.check(magic) + "\n");
        
        magic[0][0] = 4;
        System.out.println("Testing non-magic square (all are 3 except for [0][0]):");
        System.out.println("It is a magic square? " + checker.check(magic) + "\n");
        
        magic[0][1] = 9;
        magic[0][2] = 2;
        magic[1][1] = 5;
        magic[1][2] = 7;
        magic[2][0] = 8;
        magic[2][1] = 1;
        magic[2][2] = 6;

        System.out.println("Testing magic square (assignment 6 example):");
        System.out.println("It is a magic square? " + checker.check(magic) + "\n");
    
        magic = new int[4][5];
        System.out.println("Testing non-magic square ([4][5]):");
        System.out.println("It is a magic square? " + checker.check(magic) + "\n");
    }
}
