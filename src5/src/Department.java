import java.util.ArrayList;
import java.util.List;

public class Department {

    public Department(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public double getAverageSalary() {
        if (averageSalary > -1) return averageSalary;
        double salarySum = 0;
        for (Employee e : employees) salarySum += e.getSalary();
        averageSalary = salarySum / employees.size();
        return averageSalary;
    }

    private double averageSalary = -1;

    public void addEmployee(Employee employee) {
        employees.add(employee);
        averageSalary = -1;
    }

    public List<Employee> getEmployees() {
        return List.copyOf(employees);
    }

    private final List<Employee> employees = new ArrayList<Employee>();

    public void sortEmployees() {
        employees.sort((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()));
    }


}
