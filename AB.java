import java.io.*;
class A {
    void CallMe() {
        System.out.println("I am from A");
    }
}
class B extends A {
    void CallMe() {
        System.out.println("I am from B");
    }
}
class Whoami {
    public static void main(String[] args) {
        A a1 = new A();
        a1.CallMe(); 
        A a2 = new B();
        a2.CallMe(); 
        B b = new B();
        b.CallMe(); 
    }
}
