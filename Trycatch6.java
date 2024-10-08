import java.io.*;
class Trycatch6 {
    public static void main(String args[]) {
        int a = 5, b = 0, c = 0;  
        try {
            c = a / b; 
            System.out.println("Value of c is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught " );
        }
        finally {
            System.out.println(" Value of c is: " + c);
        }
    }
}
