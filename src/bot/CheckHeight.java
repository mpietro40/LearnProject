package bot;

import java.util.Scanner;

/**
 * This class is an exercise of https://hyperskill.org/
 * You should response true if the three number has an increase or decrease order, false in the other cases.
 */
public class CheckHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert three numbers");
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        if (h1 <= h2) {
            if (h2 <= h3) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else if (h2 > h3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
            /* Other way to solve the issue
            boolean asc = h1 <= h2 && h2 <= h3;
            boolean desc = h1 >= h2 && h2 >= h3;

            System.out.println(asc || desc);
             */
    }
}
