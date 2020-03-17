package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * You should response yes if the third number is a valid piece of the h1xh2 chocolate bar.
 */

public class CalculateProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two numbers...");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        long result = 1;
        for(int ii=first;ii<second;ii++){
            result *= ii;
        }
        System.out.println(result);
    }
}
