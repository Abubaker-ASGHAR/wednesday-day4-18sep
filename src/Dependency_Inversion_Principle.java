/*public class Light {
    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light turned off");
    }
}

public class Switch {
    private Light light;

    public Switch(Light light) {
        this.light = light;
    }

    public void operate(String command) {
        if ("ON".equals(command)) {
            light.turnOn();
        } else if ("OFF".equals(command)) {
            light.turnOff();
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Switch sw = new Switch(light);
        sw.operate("ON");
    }
}
*/
// Switchable.java
interface Switchable {
    void turnOn();
    void turnOff();
}

// Light.java
class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off");
    }
}

// Fan.java
 class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off");
    }
}

// Switch.java
class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String command) {
        if ("ON".equals(command)) {
            device.turnOn();
        } else if ("OFF".equals(command)) {
            device.turnOff();
        }
    }
}

// Usage
public class Dependency_Inversion_Principle {
    public static void main(String[] args) {
        Switchable light = new Light();
        Switch sw1 = new Switch(light);
        sw1.operate("ON");

        Switchable fan = new Fan();
        Switch sw2 = new Switch(fan);
        sw2.operate("OFF");
    }
}
