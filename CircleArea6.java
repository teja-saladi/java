import java.io.*;
import java.util.Scanner;

    class CircleArea6 {
     double r;
     CircleArea6()
     {
         r=0;
     }
     CircleArea6(double r)
    {
        this.r=r;
    }
    CircleArea6(int r)
    {
        this.r=r;
    }
     double Area6() {
        return (22/7.0)*r*r;
}

    // Method to set the circle's properties
    void SetCircle(double r){
        this.r = r;
    }
}
    
   
public class CircleMain6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CircleArea6 Obj8 = new CircleArea6();
        CircleArea6 Obj9 = new CircleArea6(3.6);
        CircleArea6 Obj10 = new CircleArea6(5);
         System.out.println("Area of the first circle: " + Obj8.Area6());
         Obj8.SetCircle(8);
         System.out.println("Area of the first circle updated: " + Obj8.Area6());
        System.out.println("Enter radius of circle to find area:");
        double radius = sc.nextDouble();
        CircleArea6 Obj11 = new CircleArea6();
        Obj11.SetCircle(radius);
        System.out.println("Area of circle: " + Obj11.Area6());
        System.out.println("Area of the second circle: " + Obj9.Area6());
        System.out.println("Area of the third circle: " + Obj10.Area6());
    }
}
