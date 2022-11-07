package Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForSingleLightSaber = Double.parseDouble(scanner.nextLine());
        double priceForSingleRobe = Double.parseDouble(scanner.nextLine());
        double priceForSingleBelt = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        int freeBelts = 0;
        double needed = 0;
        double discount = Math.ceil(countOfStudents + countOfStudents * 0.10);

        if (countOfStudents >= 6){
            freeBelts = countOfStudents / 6;
        } else {
            freeBelts = 0;
        }

        sum = priceForSingleLightSaber * discount + priceForSingleRobe * countOfStudents + priceForSingleBelt * (countOfStudents - freeBelts);

        if (sum <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            needed = sum - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", needed);
        }
    }
}
