package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * Given three numbers in input return true if two of them sum 20
 */

public class CheckSum20 {

    public static boolean isSum20(int a, int b) {
        boolean result = false;
        if(a+b == 20){
            result = true;
        }
        return result;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Write three number ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean response = false;
        if(isSum20(a,b) || isSum20(b,c) || isSum20(a,c)){
            response = true;
        }

        System.out.println(response);

    }
}
