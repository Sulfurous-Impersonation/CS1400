//Steven Watson
//CS1400
//Assignment 6
//April 12, 2021

public class MagicSquare 
{
    public boolean check(int[][] square)
    {
        if (square.length != 3 || square[0].length != 3)
            return false;
        ArrayProcessing processor = new ArrayProcessing();

        int commonSum = processor.getRowTotal(square, 0);
        for (int i = 1; i < square.length; i++)
            if (processor.getRowTotal(square, i) != commonSum)
                return false;
        for (int i = 0; i < square[0].length; i++)
            if (processor.getColumnTotal(square, i) != commonSum)
                return false;
        return true;
    }
}
