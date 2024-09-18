import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

public class Aggregation {
    public static void main(String[] args) {
        Department dept = new Department("Human Resources");

        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        dept.addEmployee(emp1);
        dept.addEmployee(emp2);

        dept.displayEmployees();

        // Employees can exist independently of the department
        emp1 = null;
    }
}
