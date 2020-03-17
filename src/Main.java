
import java.util.Scanner;

/**
 * First demo class
 **/
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int ii = 0; ii < size; ii++) {
            int index = 1;
            int factor = 1;
            for (int jj = 0; jj < size; jj++) {
                if (ii == jj) {
                    matrix[ii][jj] = 0;
                    index = 1;
                } else if (ii < jj) {
                    matrix[ii][jj] = index;
                    index++;
                } else {

                    matrix[ii][jj] = index + jj + ii - factor;
                    index--;
                    factor++;
                    //System.out.println(ii + "-" + jj);
                }
            }
        }

        for (int ii = 0; ii < size; ii++) {
            for (int jj = 0; jj < size; jj++) {

                System.out.print(matrix[ii][jj] + " ");
            }
            System.out.println("");
        }


    }
}

        //System.out.println("Hello World!");
        /*byte myByte = '';
        char myChar = '0';
        int number = myChar;

        long numberL = number;
        float numberF = numberL;

        //System.out.println("Char " + myChar);
        //System.out.println("number " + number);
        /*
        System.out.println("1 "+ (1 / Double.POSITIVE_INFINITY));
        System.out.println("2 "+ (1 / Double.NaN));
        System.out.println("3 "+ (Double.POSITIVE_INFINITY / 5.0));
        System.out.println("4 "+ (Double.POSITIVE_INFINITY + Double.POSITIVE_INFINITY));
        System.out.println("5 "+ (Double.NaN - Double.NaN));
        */
