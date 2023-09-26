import java.util.Scanner;
public class multiarray {
    public static void main(String[] args) {
        int m,n,i,j;
        System.out.println("Enter number of rows");
        Scanner sc= new Scanner(System.in);
        m=sc.nextInt();
        System.out.println("Enter no. of columns");
        n= sc.nextInt();
       int a[][]= new int[m][n];
       System.out.println("Enter Elements you want to store in matrix");
        for(i=0;i<m;i++)
        {
for(j=0;j<n;j++)
{ 
    a[i][j]=sc.nextInt();
}
        }
System.out.println("Multidimensional Array is");
for(i=0;i<m;i++)
{
    System.out.println("");
    for(j=0;j<n;j++)
    {
      System.out.print(" "+a[i][j]);
    }
    System.out.println("");
}        }
    }
