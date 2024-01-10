import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student1{
    String name;
    int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
public class ParallelStreams_Demo {
    public static void main(String[] args) {
        List<Student1> student1List= Arrays.asList(
                new Student1("David",80),
                new Student1("Predo",90),
                new Student1("Loris",100),
                new Student1("Bunddy",88),
                new Student1("Victor",89),
                new Student1("Emily",99)
        );
        //using stream () - sequential
        student1List.stream()
                .filter(s->s.getScore() >=80).limit(3)
                .forEach(stu ->System.out.println(stu.getName()+ " "+stu.getScore()));

        //using parallel stream
        student1List.parallelStream()
                .filter(s->s.getScore() >=80).limit(3)
                .forEach(stu ->System.out.println(stu.getName()+ " "+stu.getScore()));

        //convert stream() ----> parallelStream()
        student1List.stream().parallel()
                .filter(s->s.getScore() >=80).limit(3)
                .forEach(stu ->System.out.println(stu.getName()+ " "+stu.getScore()));

    }
}
