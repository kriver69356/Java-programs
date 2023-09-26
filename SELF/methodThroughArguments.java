class demo
{ double p,r,t,z;
    void getdata(double a, double b, double c)
    {
    
        p= a;
        r= b;
        t= c;
    }
    
        void setdata()
        {
            z= (p*r*t)/100;
        }
        void show()
        {
            System.out.println("Simple Interest="+z);
        }

    }
public class methodThroughArguments
{
    public static void main(String[] args) {
        demo d1= new demo();
        d1.getdata(45000,52,2);
        d1.setdata();
        d1.show();
    }
}