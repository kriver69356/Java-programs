import java.util.Scanner;
class test
{ 
    test()
    {
        System.out.println("This is a default constructor");
    }
    test(int a, int b)
    {
        int x=a;
        int y=b;
        System.out.println("This is a paramatrized constructor and value of  a= "+ x +" value of b= "+y);
    }
}
class constructor
{
    public static void main(String[] args) {
        test t1= new test();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int x=sc.nextInt();
        int y=sc.nextInt();
     test t2= new test(x,y);

    }
}