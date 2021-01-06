import java.util.*;

public class CompanyRosterMain {

    private static Employee parseEmployee(String line) {
        String[] tokens = line.trim().split(" ");
        Employee employee = new Employee();
        employee.setName(tokens[0]);
        employee.setSalary(Double.parseDouble(tokens[1]));
        employee.setPosition(tokens[2]);
        employee.setDepartment(tokens[3]);
        if (tokens.length == 6) {
            String email = tokens[4];
            int age = Integer.parseInt(tokens[5]);
            employee.setEmail(email);
            employee.setAge(age);

        } else if (tokens.length == 5) {
            String email = tokens[4];
            if (email.contains("@")) {
                employee.setEmail(email);
            } else {
                employee.setAge(Integer.parseInt(email));
            }
        }
        return employee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Department> index = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Employee employee = parseEmployee(scanner.nextLine());

            Department department = index.get(employee.getDepartment());
            if (department == null) {
                department = new Department(employee.getDepartment());
                index.put(department.getName(), department);
            }
            department.addEmployee(employee);
        }
        

        Department maxDep = Collections.max(index.values(), (d1, d2) -> (int) (d1.getAverageSalary() - d2.getAverageSalary()));
        //Department maxDep = index.values().stream().reduce((a, d) -> d.getAverageSalary() > a.getAverageSalary() ? d : a).get();
        System.out.println("Highest Average Salary: " + maxDep.getName());
        maxDep.sortEmployees();
        for (Employee e : maxDep.getEmployees()) {
            System.out.println(e);
        }

    }
}
