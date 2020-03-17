package bot;
import java.util.Scanner;

/**
 * This class is an exercise of https://hyperskill.org/
 * You should response true if the input is between 10 and 20 and it's not week end (second input false
 * or the input number is between 15 and 25 and it's weekend, false in the other cases.
 */
public class CheckCups {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers of cup and if it's weekend");
        int cup = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if (!weekend) {
            if (cup >= 10 && cup <= 20) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            if (cup >= 15 && cup <= 25) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
