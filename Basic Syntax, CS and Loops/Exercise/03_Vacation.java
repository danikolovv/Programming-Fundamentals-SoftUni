package Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double singlePersonPrice = 0;
        double totalPrice = 0;
        double discountPrice = 0;

        switch (group){
            case "Students":
                switch (weekDay) {
                    case "Friday" -> singlePersonPrice = 8.45;
                    case "Saturday" -> singlePersonPrice = 9.80;
                    case "Sunday" -> singlePersonPrice = 10.46;
                }
                totalPrice = people * singlePersonPrice;
                if (people >= 30){
                    discountPrice = totalPrice - totalPrice * 0.15;
                } else {
                    discountPrice = totalPrice;
                }
                break;
            case "Business":
                switch (weekDay) {
                    case "Friday" -> singlePersonPrice = 10.90;
                    case "Saturday" -> singlePersonPrice = 15.60;
                    case "Sunday" -> singlePersonPrice = 16;
                }
                totalPrice = people * singlePersonPrice;
                if (people >= 100){
                    discountPrice = totalPrice - 10 * totalPrice;
                } else {
                    discountPrice = totalPrice;
                }
                break;
            case "Regular":
                switch (weekDay) {
                    case "Friday" -> singlePersonPrice = 15;
                    case "Saturday" -> singlePersonPrice = 20;
                    case "Sunday" -> singlePersonPrice = 22.50;
                }
                totalPrice = people * singlePersonPrice;
                if (people >= 10 && people <= 20){
                    discountPrice = totalPrice - totalPrice * 0.05;
                } else {
                    discountPrice = totalPrice;
                }
                break;
        }

        System.out.printf("Total price: %.2f", discountPrice);
    }
}
