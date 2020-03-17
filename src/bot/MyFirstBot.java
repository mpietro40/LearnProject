package bot;
import java.util.Scanner;

public class MyFirstBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        sayHello("Aid",2018);
        whatsYourName();
        guessMyAge();
        simpleCount();
        proofYourProgrammer();
        end();

    }

    public static void end() {
        System.out.println("Congratulations, have a nice day!");
    }

    public static void proofYourProgrammer() {
        //write question
        String text = "Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.";
        int response = 0;
        while (response != 2) {
            System.out.println(text);
            response = scanner.nextInt();
            if (response != 2) {
                System.out.println("Please, try again.");
            }
        }
    }

    /**
     *
     */
    public static void simpleCount() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        int num = scanner.nextInt();
        for (int ii = 0; ii <= num; ii++){
            System.out.println(ii+"!");
        }
    }

    /**
     *
     * @param name
     * @param year
     */
    public static void sayHello(String name, int year){
        System.out.println("Hello! My name is "+name+".");
        System.out.println("I was created in "+year+".");

    }

    /**
     *
     */
    public static void whatsYourName(){
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    /**
     *
     */
    public static void guessMyAge(){
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");

    }
}
