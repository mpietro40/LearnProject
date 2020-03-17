package bot;

import java.util.Scanner;
import java.util.Arrays;


public class ReverseString {


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
    /**
     *
     **/
    public static String [] reverse(String [] input) {
        if (input != null) {
            int size = input.length;
            String [] output = new String [size];

            for (int ii = 0; ii < size; ii++){
                output [ii] = input[size -1 - ii];
            }
            return output;
        } else return null;


    }
}
