package Lab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 1;
        int finalSum = 0;
        for (int j = 1; j <= n; j++) {
            System.out.println(sum);
            finalSum += sum;
            sum += 2;
        }
        System.out.printf("Sum: %d", finalSum);
    }
}
