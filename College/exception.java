class exception
{
    public static void main(String[] args) {
        System.out.println("Starting of program");
        try{
            int a=50, b=0,c;
        c=a/b;
    System.out.println(c);
        }
        catch(Exception m)
        {
            System.out.println("Denominator should not be zero\n"+m);
        }
        finally{
            System.out.println("Program ended successfully");
        }
    }
}