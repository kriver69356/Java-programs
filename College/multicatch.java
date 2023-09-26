class multicatch
{
    public static void main(String[] args) {
        System.out.println("Starting of program");
        try{
            int a=50, b=0,c;
        c=a/b;
    System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException ar)
        {
            System.out.println("Few or too many arguments");
        }
        catch(NumberFormatException nf)
        {
            System.out.println("formatting of variable or number is not matched");
        }
        catch(NullPointerException ne)
        {
            System.out.println("Value of any of variable is null");
        }
        catch(ArithmeticException m)
        {
            System.out.println("Denominator should not be zero\n");
        }
        finally{
            System.out.println("Program ended successfully");
        }
    }
}