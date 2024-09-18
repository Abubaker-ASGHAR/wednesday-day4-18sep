// Defining a class
class Car {
    // Attributes (properties)
    private String color;
    private String model;
    private int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method (behavior)
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }

    // Getters and Setters (for encapsulation)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Additional getters and setters...
}

// Creating objects
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota Camry", 2020);
        Car car2 = new Car("Blue", "Honda Accord", 2021);

        car1.displayInfo();
        car2.displayInfo();
    }
}
