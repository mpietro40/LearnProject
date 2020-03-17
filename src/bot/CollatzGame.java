package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * You should response given n in input is an even number, divide it in half, if it is odd,
 * multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result..
 */
public class CollatzGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the parts number");
        int number = scanner.nextInt();
        //int result = 0;
        while (number != 1){
            if (number%2 == 0){
                number /= 2;
            } else {
                number *= 3;
                number++;
            }
            System.out.print(number+" ");
        }
    }
}
