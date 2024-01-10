import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.stream.Collectors;


class Employee{
        int eid;
        String eName;
        int salary;

        Employee(int eid, String eName, int salary) {
            this.eid = eid;
            this.eName = eName;
            this.salary = salary;
        }
    }

    public class Demo_Filter_Map {
    public static void main(String[] args) {

        /*List<Employee>employeeList= new ArrayList<Employee>();
        employeeList.add(new Employee(101,"Rana",20000));
        employeeList.add(new Employee(101,"Azad",30000));
        employeeList.add(new Employee(101,"Arif",40000));
        employeeList.add(new Employee(101,"Hafiz",50000));
        employeeList.add(new Employee(101,"Mehedi",60000));*/

        List<Employee>employeeList= Arrays.asList(
                new Employee(101,"Rana",20000),
                new Employee(102,"Azad",30000),
                new Employee(103,"Arif",40000),
                new Employee(104,"Hafiz",50000)
                );

        //Combination of filter and map
       List<Integer> employeeSalaryList = employeeList.stream()
                .filter(e ->e.salary >20000) //filtering
                .map(e ->e.salary)
                .collect(Collectors.toList());

        System.out.println(employeeSalaryList);

    }
}
