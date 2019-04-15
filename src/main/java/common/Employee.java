package common;

import java.util.Objects;

public class Employee {
    private Long id;
    private Long projectId;
    private String name;
    private String projectName;
    private Double salary;

    public Employee(Long id, Long projectId, String name, String project, Double salary) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.projectName = project;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getProjectName() {
        return projectName;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return projectName.equals(employee.projectName) &&
                salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, salary);
    }
}
