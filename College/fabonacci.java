import java.util.Scanner;
public class fabonacci {
    public static void main(String[] args) {
        int a=1,b=2,c,n,i;
        System.out.println("Enter number of terms");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    System.out.println(a+"\n"+b);
    for(i=1;i<=n;i++)
    {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
    }
}
