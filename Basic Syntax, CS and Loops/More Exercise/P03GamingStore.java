package BacisSyntaxCSandLoops.MoreExercise;
import java.util.Scanner;
public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
      
        double price = 0;
        double spent = 0;
        String command = scanner.nextLine();
      
        while (!command.equals("Game Time")){
            switch (command){
                case "OutFall 4":
                    price = 39.99;
                    if (price > balance){
                        System.out.println("Too Expensive");
                    }
                    else {
                        spent += price;
                        balance -= price;
                        System.out.println("Bought " + command);
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (price > balance){
                        System.out.println("Too Expensive");
                    }
                    else {
                        spent += price;
                        balance -= price;
                        System.out.println("Bought " + command);
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (price > balance){
                        System.out.println("Too Expensive");
                    }
                    else {
                        spent += price;
                        balance -= price;
                        System.out.println("Bought " + command);
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (price > balance){
                        System.out.println("Too Expensive");
                    }
                    else {
                        spent += price;
                        balance -= price;
                        System.out.println("Bought " + command);
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (price > balance){
                        System.out.println("Too Expensive");
                    }
                    else {
                        spent += price;
                        balance -= price;
                        System.out.println("Bought " + command);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (price > balance){
                        System.out.println("Too Expensive");
                    }
                    else {
                        spent += price;
                        balance -= price;
                        System.out.println("Bought " + command);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            command = scanner.nextLine();
        }
        if (balance > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
        }
        else {
            System.out.print("Out of mo-ney!");
        }
    }

}
