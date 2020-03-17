package bot;

import java.util.Scanner;
import java.lang.String;

public class GuessMyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String myName = scanner.nextLine();
        // reading a name

        System.out.println("What a great name you have, "+myName+"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int myAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        // reading all remainders

        System.out.println("Your age is "+myAge+"; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int max = scanner.nextInt();
        for(int ii=0;ii<=max;ii++){
            System.out.println(ii+"!");
        }

    }
}
