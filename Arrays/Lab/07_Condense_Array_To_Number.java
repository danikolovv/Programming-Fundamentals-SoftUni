package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int[numsArr.length - 1];
        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr.length == 1){
                break;
            }
            if (i == numsArr.length - 1){
                int[] condensedNew = new int[condensed.length - 1];
                i = -1;
                numsArr = condensed;
                condensed = condensedNew;
            } else {
                condensed[i] = numsArr[i] + numsArr[i + 1];
            }
        }

        System.out.println(numsArr[0]);
    }
}
