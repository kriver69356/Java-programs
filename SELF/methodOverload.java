class over
{
    int a,b;
    int area(int a, int b)
    {
        return a*b;
    }
    int area(int a)
    {
        return a*a;
    }
}
class methodOverload
{
    public static void main(String[] args) {
        int rt;
        over o= new over();
        rt= o.area(45,85);
       System.out.println("Area="+rt);
    }
}