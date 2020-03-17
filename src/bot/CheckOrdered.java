package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * Write a method with the name sign that takes an int number and checks whether the number is negative,
 * positive or zero. The method should return -1, +1 or 0 respectively.
 *
 * Write a method than given two long returns a
 */

public class CheckOrdered {

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Write an integer series ended by 0");
        int n = -1;

        List elements = new ArrayList();
        int ordered = 0;

        while (n != 0) {
            n = scanner.nextInt();
            //System.out.println("Reading n: "+n);
            if (n != 0) {
                if(elements.size() > 0 &&
                        elements.get(elements.size()-1) != null ){
                    if (((Integer)elements.get(elements.size()-1)).intValue()  > n){
                       ordered--;
                    } else {
                       ordered++;
                    }
                }
                elements.add(n);
            }
        }
        //System.out.println("Ordered "+ordered);
        //System.out.println("Elements "+(elements.size()-1));

        if (Math.abs(ordered) == elements.size()-1 ){
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}