import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter a number to check if it is prime or not");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(i=2;i<a;i++)
    {
        if(a%i==0)
        {
        System.out.println("Not prime");
        break;
        }
    }
    if(i==a)
    {
System.out.println("Number is Prime");
    }
    
}
}