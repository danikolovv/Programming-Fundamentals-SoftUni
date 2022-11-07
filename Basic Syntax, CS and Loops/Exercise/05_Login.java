package Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int pos = username.length() - 1; pos >= 0; pos--) {
            char current = username.charAt(pos);
            password += current;
        }

        String enteredPassword = scanner.nextLine();
        int countFailed = 0;

        while (!enteredPassword.equals(password)){
            countFailed++;
            if (countFailed == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
