public class Encapsulation{
    // Private fields (data hiding)
    private String name;
    private double salary;

    // Constructor
    public Encapsulation(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Must be non-negative.");
        }
    }

    public static void main(String[] args) {
        Encapsulation obj1= new Encapsulation("John Smith", 1500);
        System.out.println(obj1.getName());
    }
}
