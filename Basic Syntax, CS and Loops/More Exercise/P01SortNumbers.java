package BacisSyntaxCSandLoops.MoreExercise;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
      
        List<Integer> list = new ArrayList<Integer>();
        list.add(first);
        list.add(second);
        list.add(third);
      
        List<Integer> sorted = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
      
        sorted.forEach(System.out::println);
      
      
        //List<Integer> sortedList = list.stream().sorted().toList();
        /*List<YourType> sorted = yourList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());*/
    }

}
