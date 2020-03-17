package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * You should response true if only one of the three number provided is positive, false in the other cases.
 */

public class CheckPositive {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers of cup and if it's weekend");
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        if (h1 > 0) {
            if (h2 > 0) {
                System.out.println("false");
            } else if (h3>0){
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        } else if (h2 > 0) {
            if (h3 > 0) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        } else if (h3 > 0) {
                System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
