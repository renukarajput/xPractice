package common;

import java.util.*;

public class HighestSalaryPerProject {
    // o/p : Adis Rahul 15000 ; Env  Rakesh 14000

    //new Employee(1L, 111L, "Renuka", "Adis", 10000.0);

    public void print(List<Employee> list) {
        Map<String, List<Employee>> projectToEmpMap = new HashMap();
        List<Employee> tempList = new ArrayList();
        for (Employee e : list) {
            String projectTitle = e.getProjectName();
            if (!projectToEmpMap.containsKey(projectTitle)) {
                tempList.add(e);
                projectToEmpMap.put(projectTitle, tempList);
            } else {
                List<Employee> employeeList = projectToEmpMap.get(projectTitle);
                employeeList.add(e);
            }
        }
        Iterator<String> iterator = projectToEmpMap.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            System.out.println("^^^^^^");
            List<Employee> employees = projectToEmpMap.get(next);
            for (Employee e : employees) {
                if (e.getProjectName().equals(next)) {
                    System.out.println("-" + e.getName() + "-" + e.getSalary());
                }
            }
//            Set<Map.Entry<String, List<Employee>>> entries = projectToEmpMap.entrySet();
        }
    }
}
