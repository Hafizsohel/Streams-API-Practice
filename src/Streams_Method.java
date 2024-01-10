import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//distinct() limit()
//count()
public class Streams_Method {
    public static void main(String[] args) {
        List<String> vehiclesList = Arrays.asList("bus", "car", "train", "Airplane", "car", "bus");

        //distinct ()
        /*  List<String> distinctVehicle= vehiclesList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicle);*/
        //OR
        vehiclesList.stream().distinct().forEach(value -> System.out.println(value));

        //count ()
        long count = vehiclesList.stream().distinct().count();
        System.out.println("Vehicles Count:"+count);

        //limit ()
        List<String>limitedVehicleList = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles:" +limitedVehicleList);

        //OR
        vehiclesList.stream().limit(3).forEach(value -> System.out.println(value));
    }
}

