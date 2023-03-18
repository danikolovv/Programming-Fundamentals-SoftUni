package DataTypesAndVariables.Exercise;
import java.util.Scanner;
public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int startingYield = scanner.nextInt();
        int days = 0;
        int totalSpice = 0;
      
        while (startingYield >= 100) {
            days++;
            totalSpice += startingYield;
            if (totalSpice >= 26) {
                totalSpice -= 26;
            } else {
                break;
            }
            startingYield -= 10;
        }

        if (totalSpice >= 26) {
            totalSpice -= 26;
        } else {
            totalSpice = 0;
        }

        System.out.println(days);
        System.out.println(totalSpice);
    }

}
