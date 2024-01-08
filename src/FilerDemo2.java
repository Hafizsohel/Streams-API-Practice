import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilerDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rana","Hafizur","Azad");
        List<String > longNames = new ArrayList<String >();

        /*longNames=names.stream().filter(str ->str.length()> 4 && str.length()<8).collect(Collectors.toList());
        System.out.println(longNames);*/

//        names.stream().filter(str -> str.length()>3 && str.length()<8).forEach(str -> System.out.println(str) );

        names.stream().filter(str -> str.length()>3 && str.length()<8).forEach(System.out::println);

    }
}
