class wrapperfirst
{
    public static void main(String n[]) {
        int a,b,c;
        if(n.length!=2)
        {
            System.out.println("Few arguments or too many arguments");
        }
        else
        {
            a=Integer.parseInt(n[0]);
            b=Integer.parseInt(n[1]);
            c=a+b;
            System.out.println("Addition= "+c);
        }
    }
}