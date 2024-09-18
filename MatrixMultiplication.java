import java.io.*;
import java.util.*;
class MatrixMultiplication
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows and columns of first  matrix:");
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    System.out.println("Enter rows and columns of second  matrix:");
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int b[][]=new int[r2][c2];
    int c[][]=new int[r2][c2];
    if(r1!=r2)
    {
         System.out.println("matrix Multiplication not possible as orders does not match");
         System.exit(0);
    }
    else
    {
    
    System.out.println("Enter"+"(r1*c1)"+"elements into first matrix");
    for(int i=0;i<r1;i++)
    {
     for(int j=0;j<c1;j++)
    {
        a[i][j]=sc.nextInt();
    }
    }
     System.out.println("Enter"+"(r2*c2)"+"elements into second matrix");
    for(int i=0;i<r2;i++)
    {
     for(int j=0;j<c2;j++)
    {
        b[i][j]=sc.nextInt();
    }
    }
   for(int i=0;i<r2;i++)
    {
     for(int j=0;j<c2;j++)
    {
        for(int k=0;k<c2;k++)
        {
        c[i][j]=c[i][k]+a[i][j]*b[j][i];
        }
    }
}
    
System.out.println("After Multiplication the two matrices the resultant matrix is:");
    for(int i=0;i<r1;i++)
    {
     for(int j=0;j<c2;j++)
    {
        System.out.println(c[i][j]+" ");
}
    System.out.println();
}
}
}
}
