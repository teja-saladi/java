import java.io.*;
import java.util.*;
class MinMax
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt();
     int arr[]=new int[n];
    System.out.println("Enter"+n+"values into array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int min=arr[0],max=arr[0];
    for(int i=0;i<n;i++)
    {
        if(min>arr[i])
        {
            min=arr[i];
        }
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    System.out.println("min element of the arrray:"+min);
    System.out.println("max element of the arrray:"+max);
}
}
