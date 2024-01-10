import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus","car","train","bicycle","Airplane");
        List<String> vehiclesListUpperCase=new ArrayList<>();

        //without using streams

       /* for(String name:vehicles)

        {
            vehiclesListUpperCase.add(name.toUpperCase());
        }*/

        //using streams - map
        /*vehiclesListUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesListUpperCase);*/

        //OR
        vehicles.stream().map(name->name.toUpperCase()).forEach(System.out::println);
    }
}
