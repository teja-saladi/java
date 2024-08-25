import java.io.*;
import java.util.Scanner;

class RectangleArea {
    int l, b;

    int area() {
        return l * b;
    }
}

public class RectangleMain {
    public static void main(String args[]) {
        RectangleArea ra = new RectangleArea();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length and breadth:");
        ra.l = sc.nextInt();
        ra.b = sc.nextInt();
        
        System.out.println("Area of the Rectangle is: " + ra.area());
        
        sc.close();
    }
}
