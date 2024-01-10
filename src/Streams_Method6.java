import java.util.HashSet;
import java.util.Set;

//anyMatch
//allMatch
//noneMatch
public class Streams_Method6 {
    public static void main(String[] args) {
        Set<String>fruits=new HashSet<String>();
        fruits.add("One Apple");
        fruits.add("Two Mango");
        fruits.add("more Grape");
        fruits.add("Water Malone");
        fruits.add("One Guavas");

        //anyMatch
        boolean result = fruits.stream().anyMatch(value -> {return value.startsWith("One");
        });
        System.out.println(result);

        //AllMatch
        result = fruits.stream().allMatch(value -> {return value.startsWith("One");
        });
        System.out.println(result);

        //noneMatch
        result = fruits.stream().noneMatch(value -> {return value.startsWith("One");
        });
        System.out.println(result);
    }
}
