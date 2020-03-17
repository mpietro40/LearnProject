package bot;

import java.util.Scanner;
import java.util.StringTokenizer;


public class RotateArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrays = scanner.nextLine();
        int index = scanner.nextInt();

        //Split the string in an integer array
        StringTokenizer tokens = new StringTokenizer(arrays," ");
        int size = tokens.countTokens();
        int[] initialArray = new int[size];

        //System.out.println(size);
        for (int ii = 0 ; ii < size; ii++){
            initialArray[ii] = Integer.parseInt(tokens.nextToken());
        }

        int[] cursor = new int[size];
        //rotate until index is 0
        //but mode array size is the same like size rotation
        index = index % size;
        if (index == 0) {
            index = size;
        }
        System.out.println(" --> " + index);
        while (index > 0){
            for (int ii = 0; ii < size; ii++){
                if (ii == 0){
                    cursor[0] = initialArray[size - 1];
                } else {
                    cursor[ii] = initialArray[ii - 1];
                }
            }

//            cursor[0] = initialArray[size-1];
//            cursor[1] = initialArray[0];
//            cursor[2] = initialArray[1];
//            cursor[3] = initialArray[2];
//            cursor[4] = initialArray[3];

            index--;
            initialArray = cursor.clone();
            //System.out.println(Arrays.toString(initialArray));

        }
        for (int ii = 0; ii < size ; ii++){
            System.out.print(cursor[ii] + " ");
        }
    }
}