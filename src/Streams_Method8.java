import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_Method8 {
    public static void main(String[] args) {
        List<String> animalList= Arrays.asList("Dog","Cat","Panda");
        List<String> birdList= Arrays.asList("Crow","parrot","peacock");

        Stream<String>stream1=animalList.stream();
        Stream<String>stream2=birdList.stream();

        List<String>finalList=Stream.concat(stream1,stream2).collect(Collectors.toList());
        System.out.println(finalList);

    }
}
