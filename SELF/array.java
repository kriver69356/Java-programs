import java.util.Scanner;
class array
  {
      public static void main(String[] args) {
          int n, i;
          System.out.println("Enter number of elements you want to store in array");
          Scanner sc= new Scanner(System.in);
                    n= sc.nextInt();
                    int a[]=new int[n];
        System.out.println("Enter array elements");
                    for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Traversing of array");
for(i=0; i<a.length;i++)
{
    System.out.print(" "+ a[i]);
}
      }
  }                                  