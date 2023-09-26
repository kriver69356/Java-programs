import java.math.BigInteger;
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        BigInteger n= sc.nextBigInteger();
        BigInteger s= new BigInteger("1");
        while(n.compareTo(BigInteger.ONE) >= 0)
        {
            s=s.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        System.out.println(s);
        sc.close();
    }
}
