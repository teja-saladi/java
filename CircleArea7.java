import java.io.*;
import java.util.Scanner;

class CircleArea7 {
    double r;

    CircleArea7() {
        r = 0;
    }

    CircleArea7(double r) {
        this.r = r;
    }

    CircleArea7(CircleArea7 c) {
        this.r = c.r;
    }

    double Area7() {
        return (22 / 7.0) * r * r;
    }

    // Method to set the circle's properties
    void SetCircle(double r) {
        this.r = r;
    }
}

public class CircleMain7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        CircleArea7 c1 = new CircleArea7();
        System.out.println("Initially the Area of the first circle: " + c1.Area7());
        
        CircleArea7 c2 = new CircleArea7(7.0);
        System.out.println("Area of the circle with radius 7.0 is: " + c2.Area7());
        
        CircleArea7 c3 = new CircleArea7(5.5);
        System.out.println("Area of the circle with radius 5.5 is: " + c3.Area7());
        
        CircleArea7 c4 = new CircleArea7(c2);
        System.out.println("After copy constructor, the Area of the fourth circle is: " + c4.Area7());
        
        double radius = sc.nextDouble();
        c1.SetCircle(8.8);
        System.out.println("After setting circle radius to " + radius + ", the Area of the first circle is: " + c1.Area7());
        
        sc.close();
    }
}
