import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Demo2 {
    public static void main(String[] args) {

        List<String > teamA= Arrays.asList("Abrar","Rana","Azad");
        List<String > teamB= Arrays.asList("Kabir","Galib","Azim");
        List<String > teamC= Arrays.asList("Rashik","Riyad","Jabbar");

        List<List<String>>teamGroup= new ArrayList();
        teamGroup.add(teamA);
        teamGroup.add(teamB);
        teamGroup.add(teamC);

        //without Streams
        for (List<String>team:teamGroup){
            for (String name:team){
                System.out.println(name);
            }
        }
        //using streams flatMap()
        List<String>names = teamGroup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
        System.out.println(names);

    }
}
