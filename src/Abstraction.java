// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Concrete subclass
 class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof!
        myDog.eat();       // Outputs: This animal eats food.
    }
}
