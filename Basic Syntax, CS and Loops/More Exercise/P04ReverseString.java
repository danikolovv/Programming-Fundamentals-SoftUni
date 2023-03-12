package BacisSyntaxCSandLoops.MoreExercise;
import java.util.Scanner;
public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        String input = scanner.nextLine();
        System.out.println(StringFormatter.reverseString(input));
    }
    public static class StringFormatter {
      
        public static String reverseString(String str){
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }
    }

}
