import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams_Method3 {
    //reduce()
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
        Optional<String>reduce = stringList.stream().reduce((value, combinedValue)->{
            return combinedValue+value;
        });
        System.out.println(reduce.get());
    }
}
