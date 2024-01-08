import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer>numberList= Arrays.asList(10,20,35,40);
        List<Integer>evenNumberList= new ArrayList<Integer>();

        //without using streams
     /*   for (int n:numberList){
            if (n%2==0)
                evenNumberList.add(n);
        }
        System.out.println(evenNumberList);*/

        //using streams
       /* evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);*/

        //numberList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        numberList.stream().filter(n->n%2==1).forEach(System.out::println);

    }
}

