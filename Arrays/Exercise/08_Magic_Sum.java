package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNum = numbers[index];
            for (int innerIndex = index + 1; innerIndex <= numbers.length - 1; innerIndex++) {
                int innerCurrent = numbers[innerIndex];

                if (currentNum + innerCurrent == magicSum){
                    System.out.println(currentNum + " " + innerCurrent);
                }
            }
        }
    }
}
