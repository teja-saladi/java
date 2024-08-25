import java.io.*;
import java.util.Scanner;

class CircleArea5 {
    double r;

    CircleArea5() {
        r = 0;
    }

    

    double Area5() {
        return (22 / 7.0) * r * r; 
    }

    // Method to set the circle's radius
    void SetCircle(double r) {
        this.r = r;
    }
}

public class CircleMain5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CircleArea5 Obj6 = new CircleArea5(); 
        CircleArea5 Obj7 = new CircleArea5(); 

        System.out.println("Enter radius of circle:");
        double radius4 = sc.nextDouble();
        Obj7.SetCircle(radius4); 

        System.out.println("Area of the first circle: " + Obj6.Area5()); 
        System.out.println("Area of the second circle: " + Obj7.Area5()); 
    }
}
