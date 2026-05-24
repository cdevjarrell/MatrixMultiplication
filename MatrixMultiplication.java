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
                {7, 9, 11},
                {8, 10, 12}
        };

        // Result matrix size: rows from A, columns from B
        int rows = matrixA.length;
        int cols = matrixB[0].length;
        int[][] result = new int[rows][cols];

        // Track which row of the result is being filled
        int colIndex = 0;

        // Loop through each row in matrixA
        for (int[] row: matrixA) {

            // Track which column of the result is being filled
            int rowIndex = 0;

            // Loop through each column in matrixB
            for (int[] col : matrixB) {

                int sum = 0;

                // Multiply matching elemenets and add to sum
                for(int i = 0; i < row.length; i++){
                    sum += row[i] * col[i];
                }

                // Store sum in the result matrix
                result[colIndex][rowIndex] = sum;
                rowIndex++;
            }
            colIndex++;
        }

        // Display the final result matrix
        System.out.println("Result Matrix: ");
        for (int[] row: result){
            for (int val : row){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}