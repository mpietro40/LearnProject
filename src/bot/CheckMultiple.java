package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * You should response yes if the third number is a valid piece of the h1xh2 chocolate bar.
 */

public class CheckMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the parts number");
        int parts = scanner.nextInt();
        int max = 0;
        for(int ii=0;ii<parts;ii++){
            int current = scanner.nextInt();
            //System.out.println(current%4);
            if (current%4 == 0){
                if (current > max){
                    max = current;
                }
            }

        }
        System.out.println(max);
    }
}
