

/*public class Bird {
    public void fly() {
        // Fly implementation
    }
}

public class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}*/




/**/


// Bird.java
abstract class Bird {
    public abstract void move();
}
// FlyingBird.java
 abstract class FlyingBird extends Bird {
    public abstract void fly();

    @Override
    public void move() {
        fly();
    }
}
// Sparrow.java
class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}
// Ostrich.java
 class Ostrich extends Bird {
    @Override
    public void move() {
        System.out.println("Ostrich is running.");
    }
}
// Main.java
public class liskov_substitution_principle{
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        sparrow.move(); // Sparrow flies
        ostrich.move(); // Ostrich runs

        // Demonstrating LSP
        Bird[] birds = {sparrow, ostrich};
        for (Bird bird : birds) {
            bird.move();
        }
    }
}
