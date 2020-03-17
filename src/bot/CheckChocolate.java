package bot;

import java.util.Scanner;

/**
 * This class is an exercise of https://hyperskill.org/
 * You should response yes if the third number is a valid piece of the h1xh2 chocolate bar.
 */
public class CheckChocolate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Insert three numbers");
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        int max = h1*h2;
        int diff = max - h3;

        if (h3 < max && (diff%h1 == 0 || diff%h2 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
