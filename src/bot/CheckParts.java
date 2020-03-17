package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * You should response yes if the third number is a valid piece of the h1xh2 chocolate bar.
 */

public class CheckParts {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the parts number");
        int parts = scanner.nextInt();
        int correct = 0;
        int wrong = 0;
        int toBeFixed = 0;
        for(int ii=0;ii<parts;ii++){
            int result = scanner.nextInt();
            if (result == 0){
                correct++;
            } else if (result == 1){
                toBeFixed++;
            } else if (result == -1){
                wrong++;
            }

        }
        System.out.println(correct+" "+toBeFixed+" "+wrong);
    }
}
