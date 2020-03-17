package bot;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour,
 * the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.
 * But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges.
 * Can you find out if this will happen?
 * The first line of the input contains the height of the bus and number of bridges under which the bus passes.
 * The second line contains heights of these bridges.
 *
 * You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i"
 * (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the bus,
 * the bus will crash.
 */
public class CheckBridge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Bus height in cm and the bridges proposed");
        int bus = scanner.nextInt();
        int bridges = scanner.nextInt();
        //System.out.println("Insert Bridge height in cm:");
        String message = "Will not crash";
//        String elements = scanner.nextLine();
//        System.out.println("elements "+elements);
//        StringTokenizer values = new StringTokenizer(elements);
        //int currBridge = scanner.nextInt();
        int ii = 1;
        int currBridge = scanner.nextInt();
        String line = scanner.nextLine();
        //System.out.println("The line is "+line);
        StringTokenizer token = new StringTokenizer(line);
        while (ii<bridges) {
            if (currBridge <= bus) {
                message = "Will crash on bridge "+ii;
                break;
            }
            if (token.hasMoreTokens()) {
                currBridge = Integer.parseInt(token.nextToken());
            } else {
                break;
            }
            //System.out.println(currBridge);
            ii++;
            //currBridge = scanner.nextInt();
        }

        System.out.println(message);
    }
}
