import java.util.Scanner;

public class MatrixRotate {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        //#read input matrix
        for (int ii = 0; ii < rows; ii++) {
            for (int jj = 0; jj < columns; jj++) {
                    matrix[ii][jj] = scanner.nextInt();
            }
        }
        //#reshape
        int[][] rematrix = new int [columns][rows];
        for (int ii = columns - 1; ii >= 0; ii--) {
            for (int jj = rows - 1; jj >= 0; jj--) {
                rematrix[ii][jj] = matrix[jj][ii];
            }
        }

        //#print
        for (int ii = 0; ii < columns; ii++) {
            for (int jj = rows - 1; jj>= 0; jj--) {
                System.out.print(rematrix[ii][jj] + " ");
            }
            System.out.println("");
        }
    }
}

