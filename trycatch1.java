//ArithmeticException
import java.io.*;
class Trycatch1 {
    public static void main(String args[]) {
        int a = 5, b = 0, c;

        try {
            c = a / b;  
            System.out.println("Value of c is: " + c);
        } catch (ArithmeticException ae) {
            System.out.println("Exception caught");
        }
    }
}


//Exception
import java.io.*;
class Trycatch1 {
    public static void main(String args[]) {
        int a = 5, b = 0, c;

        try {
            c = a / b;  
            System.out.println("Value of c is: " + c);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

