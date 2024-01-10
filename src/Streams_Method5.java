import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

        //Sorted
public class Streams_Method5 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(2,4,1,3,7,5,9,6,8,10);
        List<Integer>sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList); // ascending order

        List<Integer>reverseSortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList); // descending order

        //Strings
        List<String> list2 =Arrays.asList("John","Mary","Kim","David","Bunddy","Larray");
        List<String>sortedList2 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2); // ascending order

        //Strings
        List<String>reverseSortedList2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList2); // descending order
    }
}
