class first
{ int a,b;
    public void get()
    {
   a=30;
   b=45;
}
}
class second extends first
{
   public void show()
    { 
        super.get();
        int c=a+b;
        System.out.println("Addition= "+c);
    }
}
class third extends first
{
   public void show()
    {
        super.get();
    int d=a*b;
    System.out.println("Multiplication= "+d);
}
}
class hierarchicalinheritance
{
    public static void main(String[] args) {
       second s= new second();
        s.get();
        s.show();
        third th= new third();
        th.get();
        th.show();
    }
}
