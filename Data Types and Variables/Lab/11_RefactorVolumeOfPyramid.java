package Lab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dul, sh, V = 0;
        dul = Double.parseDouble(scanner.nextLine());
        sh = Double.parseDouble(scanner.nextLine());
        V = Double.parseDouble(scanner.nextLine());

        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");

        V = (dul * sh * V) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);

    }
}
