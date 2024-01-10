import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sname;
    int sid;
    char grade;

    public Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}

public class FlatMap_Demo3 {
    public static void main(String[] args) {
        List<Student>studentList1 = new ArrayList<Student>();

        studentList1.add(new Student("Abrar",101,'A'));
        studentList1.add(new Student("Rana",102,'B'));
        studentList1.add(new Student("Azad",103,'C'));
        studentList1.add(new Student("Riyad",104,'D'));

        List<Student>studentList2 = new ArrayList<Student>();

        studentList1.add(new Student("Jabbar",105,'A'));
        studentList1.add(new Student("Azim",106,'B'));
        studentList1.add(new Student("Rashik",107,'C'));
        studentList1.add(new Student("Shohag",108,'D'));

        List<List<Student>>studentList = Arrays.asList(studentList1,studentList2);

        //without using streams
       /* for (List<Student> s:studentList){
            for (Student std:s){
                System.out.println(std.sname);
            }
        }*/

        //using streams flat Map
        List<String>names = studentList.stream()
                .flatMap(stdList ->stdList.stream())
                .map(s-> s.sname)
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
