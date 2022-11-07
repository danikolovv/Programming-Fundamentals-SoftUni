package Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstHour = Integer.parseInt(scanner.nextLine());
        int firstMin = Integer.parseInt(scanner.nextLine());

        int allInMin = (firstHour * 60) + firstMin + 30;

        int secondHour = allInMin / 60;
        int secondMin = allInMin % 60;

        if(secondHour > 23){
            secondHour = 0;
        }

        System.out.printf("%d:%02d", secondHour, secondMin);
    }
}
