import java.util.Scanner;
class evenfromarange
{
    public static void main(String[] args) {
        int a,b,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter starting of range");
a=sc.nextInt();
System.out.println("Enter Ending of range");
b=sc.nextInt();
for(i=a;i<=b;i++)
{
if(i%2==0){
System.out.println(i+" is even");
}
else
{
    System.out.println(i+" is odd ");
}
}
}
}