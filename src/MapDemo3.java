import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer>numberList= Arrays.asList(2,3,4,5);
        List<Integer>result=new ArrayList<>();

        //without streams
        /*for (int num:numberList){
            System.out.println(num*3);
        }*/

        //streams - map
        /*result= numberList.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println(result);*/

        //OR
       // numberList.stream().map(num ->num*3).forEach(num -> System.out.println(num));
        numberList.stream().map(num ->num*3).forEach(System.out::println);

    }
}
