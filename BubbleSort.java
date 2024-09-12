import java.io.*;
import java.util.*;
class BinarySearch
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int pos=-1;
    System.out.println("Enter size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter"+n+"values into array in sorted order");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<i-1;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("After sorting the elements in the array are");
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+" ");
    }
}
}
