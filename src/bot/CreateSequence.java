package bot;

import java.util.Scanner;
/**
 * You should output the sequence printing same times of the printed number till the number of element reach the input.
 * For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
 * Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).
 */
public class CreateSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number of element for the sequence");
        int sequence = scanner.nextInt();
        //System.out.println("The line is "+line);
        int counter = sequence;
        for (int ii = 1; ii<=sequence; ii++) {
            for (int jj=0; jj<ii;jj++) {
                if (counter > 0){
                    System.out.print(ii+" ");
                    counter--;
                }
            }
        }

    }
}
