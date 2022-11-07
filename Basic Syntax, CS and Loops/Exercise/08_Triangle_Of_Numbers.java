package Exercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. получава се число
        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;

        for (int rows = 1; rows <= n; rows++) {
            System.out.println(number);
            if (number >= n){
                break;
            }
            number += 1;
            for (int line = 1; line < number; line++) {
                System.out.print(number + " ");
            }
        }
    }
}
