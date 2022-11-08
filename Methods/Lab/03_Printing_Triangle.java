package Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printTriangles(Integer.parseInt(scanner.nextLine()), 0);

    }

    public static void printTriangles(int number, int visualisedNum){
        for (int i = 1; i <= number; i++) {
            printLine(1, i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
