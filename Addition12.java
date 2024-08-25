import java.io.*;

class Addition {
    // Method to add two integers
    int add(int x, int y) {
        return x + y;
    }

    // Method to add three integers
    int add(int x, int y, int z) {
        return x + y + z;
    }

    // Method to add an integer and a float (returns a float)
    float add(int x, float y) {
        return x + y;
    }

    // Method to add two floats
    float add(float x, float y) {
        return x + y;
    }
    
}

public class AdditionMain {
    public static void main(String args[]) {
        Addition a = new Addition();

        // Using the add methods
        System.out.println("Sum of 5 and 10 is: " + a.add(5, 10));
        System.out.println("Sum of 20, 30, and 50 is: " + a.add(20, 30, 50));
        System.out.println("Sum of 1.2 and 3.3 is: " + a.add(1.2f, 3.3f));
        System.out.println("Sum of 5.5 and 7.7 is: " + a.add(5.5f, 7.7f));
    }
}
