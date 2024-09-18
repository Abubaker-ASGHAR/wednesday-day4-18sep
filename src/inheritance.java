// Superclass
 class Vehicle {
    protected String brand = "Generic Vehicle";

    public void honk() {
        System.out.println("Vehicle is honking.");
    }
}

// Subclass
class Car1 extends Vehicle {
    private String model = "Generic Car";

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.honk();          // Inherited method
        myCar.displayInfo();   // Class-specific method
    }
}
