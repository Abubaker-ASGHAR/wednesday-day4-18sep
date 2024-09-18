 class MathUtils {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class compile_time_polymorphism {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        System.out.println(math.add(2, 3));        // Outputs: 5
        System.out.println(math.add(2, 3, 4));     // Outputs: 9
        System.out.println(math.add(2.5, 3.5));    // Outputs: 6.0
    }
}
