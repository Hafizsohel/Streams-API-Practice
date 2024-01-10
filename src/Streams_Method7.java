import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny
//findFirst
public class Streams_Method7 {
    public static void main(String[] args) {
       // List<String>stringList= Arrays.asList("one","two","three","one");
        List<String>stringList= Arrays.asList();

       /* Optional<String>ele=stringList.stream().findAny();
        System.out.println(ele.get());*/

        //findFirst
        List<String>stringList1= Arrays.asList("one","two","three","one");
        Optional<String>element=stringList1.stream().findFirst();
        System.out.println(element.get());
    }
}
