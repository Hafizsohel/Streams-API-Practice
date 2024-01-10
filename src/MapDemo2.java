import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus","car","train","bicycle","Airplane");
        //List<String> vehiclesListUpperCase=new ArrayList<>();

        //without streams
        /*for (String name:vehicles){
            System.out.println(name.length());
        }*/

        //with streams
       // vehicles.stream().map(vname ->vname.length()).forEach(len -> System.out.println(len));

        //OR
        vehicles.stream().map(vname->vname.length()).forEach(System.out::println);

    }
}
