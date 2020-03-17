package bot;
import java.util.Scanner;

/**
 * This class is an exercise of https://hyperskill.org/
 * Write a method with the name sign that takes an int number and checks whether the number is negative,
 * positive or zero. The method should return -1, +1 or 0 respectively.
 *
 * Write a method than given two long returns a
 */
public class CheckNumbers {

    public static int sign(int number) {
        int result = 0;
        if (number >0){
            result = 1;
        } else if (number < 0){
            result = -1;
        }
        return result;
    }

    public static double divide(long a, long b) {
        double result = new Double(a)/new Double(b);
        return result;
    }

    public static boolean isComposite(long n) {
        // write your code here
        if (n == 1 || n == 2 || n == 3 || n == 5 || n == 7 || n == 11){
            return false;
        } else {
            for(int ii=2;ii<n;ii++){
                System.out.println(n%ii);
                if(n%ii == 0){
                    return true;
                }
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Write an integer ");
        final int n = scanner.nextInt();
        System.out.println(sign(n));

        System.out.println("Write two long numbers and check the result");
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();;
        System.out.println(divide(a,b));
        */
        System.out.println("Write a long numbers and check if it's composite");
        final long c = scanner.nextLong();
        System.out.println(isComposite(c));


    }
}