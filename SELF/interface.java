import java.util.Scanner;
interface loan
{
    void interest();
}
interface minimum
{
  void minimuminvest();
}
class home_loan implements loan,minimum
{
    Scanner sc= new Scanner(System.in);
  public void interest()
  {
      System.out.println("The interest per annum on home loan is 12% ");
      System.out.println("Enter loan amount to get the return amount ");
int a= sc.nextInt();
int b= (a*12/100)+a;
System.out.println("Return amount= "+b);
  }
  public void minimuminvest()
  {
    System.out.println("Minimum amount is 20000");
  }
}
class Ed_loan implements loan
{
    public void interest()
  { Scanner sc= new Scanner(System.in);
      System.out.println("The interest per annum on education loan is 2% ");
      System.out.println("Enter loan amount to get the return amount ");
      int a= sc.nextInt();
      int b= (a*2/100)+a;
      System.out.println("Return amount= "+b);
  }
  public void minimuminvest()
  {
    System.out.println("Minimum amount is 20000");
  }
}
class veh_loan implements loan
{
    public void interest()
  { Scanner sc= new Scanner(System.in);
      System.out.println("The interest per annum on vehicle loan is 15% ");
      System.out.println("Enter Vehicle loan amount to get the return amount ");
      int a= sc.nextInt();
      int b= (a*15/100)+a;
      System.out.println("Return amount= "+b);
  }
  public void minimuminvest()
  {
    System.out.println("Minimum amount is 20000");
  }
}
class prop_loan implements loan
{  Scanner sc= new Scanner(System.in);
    public void interest()
  {
      System.out.println("The interest per annum on property loan is 20% ");
      System.out.println("Enter Property loan amount to get the return amount ");
      int a= sc.nextInt();
      int b= (a*20/100)+a;
      System.out.println("Return amount= "+b);
  }
  public void minimuminvest()
  {
    System.out.println("Minimum amount is 20000");
  }


public static void main(String[] args) {
    home_loan objh= new home_loan();
    veh_loan objv = new veh_loan();
    Ed_loan objed= new Ed_loan();
    prop_loan objprop = new prop_loan();
    objh.interest();
    objh.minimuminvest();
    objv.interest();
    objv.minimuminvest();
    objed.interest();
    objed.minimuminvest();
    objprop.interest();
    objprop.minimuminvest();
    System.out.println("Program Ended");
}
}