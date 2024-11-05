import java.io.*;
import java.lang.String;
public class RunnableinterfaceDemo implements Runnable
{  
public void run()  
{    
System.out.println("Thread is created and is executed");    
}    
public static void main(String argvs[])  
{   
RunnableinterfaceDemo ob  = new RunnableinterfaceDemo();   
Thread t = new Thread(ob);    
t.start();  
  
}    
}    
