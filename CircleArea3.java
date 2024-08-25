import java.io.*;
import java.util.Scanner;

    class CircleArea3 {
     double  r;
     double Area3() {
        return (22/7.0)*r*r;
}

    // Method to set the circle's properties
    void SetCircle(double r){
        this.r = r;
    }
}
    
   
public class CircleMain3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CircleArea3 Obj2 = new CircleArea3();
        CircleArea3 Obj3 = new CircleArea3();
        System.out.println("Enter radius of circle:");
        double radius = sc.nextDouble();
        double radius1= sc.nextDouble();
        Obj2.SetCircle(radius);
        Obj3.SetCircle(radius1);
        
        System.out.println("Area of the first circle: " + Obj2.Area3());
        System.out.println("Area of the second circle: " + Obj3.Area3());
    }
}
