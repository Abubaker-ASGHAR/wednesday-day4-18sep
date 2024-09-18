class Engine1 {
    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

 class Car3 {
    // Composition: Car has an Engine
    private Engine1 engine;

    public Car3() {
        engine = new Engine1(); // Creating Engine instance
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is moving.");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Car has stopped.");
    }
}

public class composition {
    public static void main(String[] args) {
        Car3 myCar = new Car3();
        myCar.startCar();
        myCar.stopCar();
    }
}
