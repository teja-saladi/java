import java.io.*;
import java.lang.String;
public class ThreadclassDemo extends Thread 
{  
public static void main(String argvs[])  
{  
Thread t1= new Thread("My thread");  
 ThreadclassDemo t2=new ThreadclassDemo();
 t1.start();
t2.start();  
String str = t1.getName();  
System.out.println("the name of thread one is:"+str);  
}  
}  
