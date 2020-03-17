package bot;

import java.util.Scanner;
/**
 * Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞),
 * and False otherwise (case sensitive).
 */

public class CheckFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number to check");
        int h1 = scanner.nextInt();
        if ((h1 > -15 && h1<= 12) ||
                (h1 > 14 && h1< 17)||
                (h1 >= 19)){
                System.out.println("True");
        } else {
            System.out.println("False");

        }


    }
}
