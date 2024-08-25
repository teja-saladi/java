import java.io.*;
import java.util.Scanner;

    class CircleArea4 {
     double x,y,r;
     CircleArea4()
     {
         r=0;
     }
    
     double Area4() {
        return (22/7.0)*r*r;
}

    // Method to set the circle's properties
    void SetCircle(double r){
        this.r = r;
    }
}
    
   
public class CircleMain4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CircleArea4 Obj4 = new CircleArea4();
        CircleArea4 Obj5 = new CircleArea4();
        System.out.println("Enter radius of circle:");
        double radius2 = sc.nextDouble();
        double radius3= sc.nextDouble();
        Obj4.SetCircle(radius2);
        Obj5.SetCircle(radius3);
        
        System.out.println("Area of the first circle: " + Obj4.Area4());
        System.out.println("Area of the second circle: " + Obj5.Area4());
    }
}
