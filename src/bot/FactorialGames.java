package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * A user inputs a long number M. You need to find out what is the smallest long number n such that n! > M.
 */

public class FactorialGames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the long number");
        long number = scanner.nextLong();
        int element = 0;
        long cursor;
        do {

            cursor = factorial(++element);
            System.out.println("element: "+element+" cursor: "+cursor);

        } while (cursor <= number);
        System.out.print(--element);
    }

    /**
     * This function execute the elaboration for factorial based on input value
     * @param cursor
     * @return
     */
    public static long factorial(int cursor){
        long result = 1;
        for(int ii = 1;ii<cursor;ii++){
            result *= ii;
        }
        return result;
    }
}
