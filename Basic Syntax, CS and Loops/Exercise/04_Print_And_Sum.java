package Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //стартово число
        //крайно число

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int num = start; num <= finish; num++) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
