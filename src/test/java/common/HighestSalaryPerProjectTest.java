package common;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HighestSalaryPerProjectTest {
// output = Adis Rahul 15000
//          Env  Rakesh 14000
//         Cloud Pooja  12000
    HighestSalaryPerProject highestSalaryPerProject = new HighestSalaryPerProject();
    @Test
    public void input_1() {
        Employee e1 = new Employee(1L, 111L, "Renuka", "Adis", 10000.0);
        Employee e2 = new Employee(2L, 333L, "Pooja", "Cloud", 12000.0);
        Employee e3 = new Employee(3L, 222L, "Rakesh", "Env", 14000.0);
        Employee e4 = new Employee(4L, 111L, "Rahul", "Adis", 15000.0);
        Employee e5 = new Employee(5L, 333L, "John", "Cloud", 10000.0);
        Employee e6 = new Employee(6L, 222L, "Jenny", "Env", 11000.0);
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        highestSalaryPerProject.print(list);

    }
}