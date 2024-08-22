import java.io.*;
import java.util.Scanner;
class CircleArea
{
    double x,y;
    double r;
    double Area( )
    {
    return (22/7.0)*r*r;
    }
}
class CircleMain 
{
    public static void main(String args[])
{
    CircleArea ca = new CircleArea();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter centre x,y value:");
    ca.x=sc.nextInt();
    ca.y=sc.nextInt();
    ca.r=((ca.x*ca.x)+(ca.y*ca.y));
    System.out.println("Area of the circle is:"+ca.Area());
}
}
