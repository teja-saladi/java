import java.io.*;
import java.lang.*;
import java.util.*;
public class StringconcatDemo
{
    public static void main(String args[])
    {
        String s1="Hello";
        String s2="World";
        String s3=s1.concat(s2);
        System.out.println("The result of s1 concate s3 is"+s3);
        String s4="SasiSiteWelcomeHello";
        String s5=s4.join("Wel",s2);
        System.out.println("After joining of s4 in s2:" +s5);
        System.out.println("result of s1+s2 is "+(s1+s2));
        System.out.println("result of s1+s3 is "+(s1+s3));
    }
}
