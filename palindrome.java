mport java.io.*;
import java.util.Scanner;
public class Palindrome
{
    public static void main(string[] args)
    {
        int r,s=0,temp,x;
        Scanner sc=newScanner(System.in);
        System.out.println("Enter an integer to check it is palindrome or not: ");
        x=Sc.nextInt();
        temp=x;
        while(x>0)
        {
            r=x%10;
            S=(S*10)+r;
            x=x/10;
        }
        if(temp==s)
        {
            System.out.println(temp+"is a palindrome");
        }
        else
	      {
            System.out.println(temp+"is not a palindrome");
        }
   }
}
