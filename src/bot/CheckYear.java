
package bot;

import java.util.Scanner;

public class CheckYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Insert three numbers");
        double amount = scanner.nextDouble();
        double percent = scanner.nextDouble()/100;
        double target = scanner.nextDouble();
        int years = 0;
        double capital = 0;
        while (capital < target) {
            capital = amount * Math.pow(1 + percent, ++years);
            System.out.println(capital);
        }
        if (amount == target) {
            years = 0;
        }
        System.out.println(years);
    }
}
