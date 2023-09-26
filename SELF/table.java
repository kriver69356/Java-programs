import java.util.*;
public class table {
    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter any number for table");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {

            System.out.println(n+"x"+i+"="+n*i); //This is simplest logic for printing table

        }

    }
}
