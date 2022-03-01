//Steven Watson
//CS1400
//Assignment 6
//April 12, 2021

public class ArrayProcessingDemo 
{
    public static void main(String[] args)
    {
        System.out.println("Testing ArrayProcessing class\n");
        System.out.println("New 2D array: int[4][5]");
        int[][] matrix = new int[4][5];
        int count = 0;
        ArrayProcessing processor = new ArrayProcessing();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = count;
                count++;
            }

        System.out.println("Each value in the matrix is one higher than the last (row-major order, starting at 0)\n");
        System.out.println("getTotal returns: " + processor.getTotal(matrix));
        System.out.println("getAverage returns: " + processor.getAverage(matrix));
        System.out.println();

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.println("getRowTotal at row " + i + " returns: "
            + processor.getRowTotal(matrix, i));
        }
        System.out.println();

        for (int i = 0; i < matrix[0].length; i++)
        {
            System.out.println("getColumnTotal at column " + i + " returns: "
            + processor.getColumnTotal(matrix, i));
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.println("getHighestInRow at row " + i + " returns: "
            + processor.getHighestInRow(matrix, i));
            System.out.println("getLowestInRow at row " + i + " returns: "
            + processor.getLowestInRow(matrix, i));
        }
    }
}
