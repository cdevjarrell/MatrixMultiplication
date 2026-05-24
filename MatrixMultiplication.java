// This program multiplies two matricies together using enhanced for loops
// and displays the resulting matrix.

public class MatrixMultiplication {
    public static void main(String[] args) {

        // Define first matrix (2 rows, 3 columns)
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Define second matrix (3 rows, 2 columns)
        int[][] matrixB = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Result matrix size: rows from A, columns from B
        int rows = matrixA.length;
        int cols = matrixB[0].length;
        int[][] result = new int[rows][cols];
    }
}