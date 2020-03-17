
package bot;

import java.util.Scanner;

public class CheckTravel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodxDay = scanner.nextInt();
        int travel = scanner.nextInt();
        int costNight = scanner.nextInt();
        // put your code here
        int total = days*foodxDay + (days - 1) * costNight + travel * 2;
        System.out.println(total);
    }
}