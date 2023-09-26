import java.util.Scanner;
class demo
{ double p,r,t,z;
    void getdata()
    {
        System.out.println("Enter the value of p,r,t");
        Scanner sc=new Scanner(System.in);
        p= sc.nextDouble();
        r= sc.nextDouble();
        t= sc.nextDouble();
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
class method
{
    public static void main(String[] args) {
        demo d1= new demo();
        d1.getdata();
        d1.setdata();
        d1.show();
    }
}