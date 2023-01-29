package BacisSyntaxCSandLoops.Lab;
import java.util.Scanner;
public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int n = Integer.parseInt(scanner.nextLine());
      
        boolean Stop = false;
        while (!Stop){
            if (n % 2 != 0){
                System.out.println("Please write an even number.");
            }
            else {
                System.out.printf("The number is: %d", Math.abs(n));
                Stop = true;
            }
            n = Integer.parseInt(scanner.nextLine());
        }
    }
}

//but judge doesn't liked it
