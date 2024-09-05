import java.io.*;
import java.util.*;
class LinearSearch
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int pos=-1;
    System.out.println("Enter size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter"+n+"values into array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter key element to search:");
    int key =sc.nextInt();
    for(int i=0;i<n;i++)
    {
        if(arr[i]==key)
        {
            pos=i+1;
            break;
        }
    }
    if(pos==-1)
    {
        System.out.println(key+"not found in the array ");  
    }
    else
    {
        System.out.println(key+"is found at"+pos+"position in the array");
    }
}
}
