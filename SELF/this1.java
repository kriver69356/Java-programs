class test
{
    int a,b;
   void getval(int a, int b)
    {
        this.a=100;
        this.b=500;
        System.out.println("Formal parameter a= "+a);
        System.out.println("Formal parameter b= "+b);
    }
    void show()
    {
        System.out.println("Data members a= "+this.a);
        System.out.println("Data members a= "+this.b);
    }
}

class this1{
    public static void main(String[] args) {
        test t= new test();
        t.getval(100, 200);
        t.show();
    }
}