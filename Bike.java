import java.io.*;
import java.util.*;

abstract class Bike {
    
    abstract void run();
}

class Honda extends Bike {
    void run() {
        System.out.println("Honda is running");
    }
    public static void main(String args[]) {
        Bike b = new Honda();
        b.run();  
    }
}
