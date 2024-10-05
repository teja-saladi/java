import java.util.*;

class Animal {
    String color = "white";
    Animal() {
        System.out.println("Animal Object is created");
    }
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    String color = "black"; 
    Dog() {
        super();
        System.out.println("Dog object is created");
    }
    void printcolor() {
        System.out.println("Dog color is " + color); 
        System.out.println("Animal color is " + super.color);
        super.eat();
    }
}
class SuperDemo2 {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printcolor(); 
    }
}
