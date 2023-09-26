import java.util.Scanner;
class test
{   int x,y;
    test()
    {
        System.out.println("This is a default constructor");
    }
    test(int a, int b)
    {
        x=a;
        y=b;
    }
    public void display()
    {
        System.out.println("This is a parametrized constructor and value of  a= "+ x +" value of b= "+ y);
    }
}
class constructorclass
{
    public static void main(String[] args) {
        test t1= new test(); // This will go to default constructor
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int x=sc.nextInt();
        int y=sc.nextInt();
        test t2= new test(x,y); // This will go to parameterized constructor 
        t2.display();

    }
}