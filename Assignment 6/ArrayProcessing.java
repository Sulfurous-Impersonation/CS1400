//Steven Watson
//CS1400
//Assignment 6
//April 12, 2021

public class ArrayProcessing
{
    //int[numRows][numCols]

    public int getTotal(int[][] matrix)
    {
        int total = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                total += matrix[i][j];
        return total;
    }

    public int getAverage(int[][] matrix)
    {
        int avg = 0;
        avg = getTotal(matrix) / (matrix.length * matrix[0].length);
        return avg;
    }

    public int getRowTotal(int[][] matrix, int row)
    {
        int total = 0;
        for (int i = 0; i < matrix[row].length; i++)
            total += matrix[row][i];
        return total;
    }

    public int getColumnTotal(int[][] matrix, int col)
    {
        int total = 0;
        for (int i = 0; i < matrix.length; i++)
            total += matrix[i][col];
        return total;
    }

    public int getHighestInRow(int[][] matrix, int row)
    {
        int highest = matrix[row][0];
        for (int i = 1; i < matrix[row].length; i++)
            if (highest < matrix[row][i])
                highest = matrix[row][i];
        return highest;
    }

    public int getLowestInRow(int[][] matrix, int row)
    {
        int lowest = matrix[row][0];
        for (int i = 1; i < matrix[row].length; i++)
            if (lowest > matrix[row][i])
                lowest = matrix[row][i];
        return lowest;
    }
}