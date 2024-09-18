// Superclass
class Animal1 {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
 class Cat2 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class run_time_polymorphism {
    public static void main(String[] args) {
        Animal1 myAnimal = new Cat2(); // Upcasting
        myAnimal.makeSound();        // Outputs: Meow!
    }
}
