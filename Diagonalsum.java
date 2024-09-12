import java.io.*;
import java.util.*;
class DiagonalSum
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int sum=0;
    System.out.println("Enter size of matrix:");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("Enter"+"(r*c)"+"elements into matrix");
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
    {
        arr[i][j]=sc.nextInt();
    }
    }
    if(r!=c)
    {
        System.out.println("please enter a square matrix:");
    }
    else
    {
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(i==j)
        {
            sum=sum+arr[i][j];
        }   
    }
}
}
System.out.println("sum of principal diagonal elements is:"+sum);
}
}
