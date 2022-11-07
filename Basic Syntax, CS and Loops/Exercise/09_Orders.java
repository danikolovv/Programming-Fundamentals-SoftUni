package Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());;
        double pricePerCapsule = 0;
        int days = 0;
        int capsulesCount = 0;

        double priceForCoffee = 0;
        double total = 0;

        for (int index = 1; index <= countOrders; index++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());
            priceForCoffee = (days * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n", priceForCoffee);
            total += priceForCoffee;
            priceForCoffee = 0;
        }
        System.out.printf("Total: $%.2f", total);
    }
}
