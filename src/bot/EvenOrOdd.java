package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * Given a sequence of natural numbers.
 * For each number of the sequence output "even" if the number is even, otherwise, "odd".
 * If the number is equal to 0, the program must stop reading and processing numbers.
 */
public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 0 to stop the game");
        int check = 1;
        String response = "";
        while (check != 0){
            check = scanner.nextInt();
            if (check == 0) {
                //do nothing
            } else if (check % 2 == 0 ){
                response += "even\n";
            } else {
                response += "odd\n";
            }
        }
        System.out.print(response);
    }
}
