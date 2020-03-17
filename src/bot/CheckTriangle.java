package bot;

import java.util.Scanner;
/**
 * This class is an exercise of https://hyperskill.org/
 * You should response true if the three number provided as side, can create a valid triangle.
 */

public class CheckTriangle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert three numbers");
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
/*
Regole per verificare se dati i tre lati e' possibile creare un triangolo
a < b+c && a > |b-c|
b < a+c && b > |a-c|
c < a+b && c > |a-b|

 */
//  ALTERNATIVA ->     if (h1 + h2 > h3 && h1 + h3 > h2 && h2 + h3 > h1) {
        if (h1 < (h2 + h3) && h1 > Math.abs(h2-h3) ||
                h2 < (h1 + h3) && h2 > Math.abs(h1-h3) ||
                h3 < (h2 + h1) && h3 > Math.abs(h2-h1)
        ) {
                System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
