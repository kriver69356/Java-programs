class Test
{
    int a,b;
    Test()
    {
        a=0;
        b=0;
        System.out.println("Value of a= "+a);
        System.out.println("Value of b= "+b);

    }
    Test(int x, int y)
    {
        a=x;
        b=y;
        int sum= a+b;
   System.out.println("Addition= "+sum); 
}
Test(int a)
{
   int x=a;
   int y=0;
   int z=x+y;
    System.out.println("Addition= "+z);
}
}
class SirConsOver
{
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test(10,20);
        Test t3=new Test(45);
    }
}