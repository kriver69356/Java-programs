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

class inheritance
{
    public static void main(String[] args) {
       second s= new second();
        s.show();
        s.get();
    }
}
