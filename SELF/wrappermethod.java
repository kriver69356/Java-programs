class wrapper
{
    int a,b,c;
    void getdata(int p, int q)
    {
        a=p;
        b=q;
    }
    void setdata()
    {
        c=a+b;
    }
    void show()
    {
        System.out.println("Addition= "+c);
    }
}
public class wrappermethod
{
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
         
        wrapper wr=new wrapper();
        wr.getdata(a,b);
        wr.setdata();
        wr.show();
    }
}
