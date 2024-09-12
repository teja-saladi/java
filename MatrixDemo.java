import java.io.*;
import java.util.*;
class MatrixDemo
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter size of matrix:");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("Enter"+"(r*c)"+"elements into matrix");
    for(int i=0;i<r-1;i++)
    {
     for(int j=0;j<c;j++)
    {
        arr[i][j]=sc.nextInt();
    }
    }
     System.out.println("the elements in the array are:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
    System.out.println(arr[i][j]+" ");
        }
        System.out.println(" ");
    }
}
}
