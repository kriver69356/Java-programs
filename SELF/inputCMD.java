class inputCMD
{
    public static void main(String[] args) {
        System.out.println("no. of commands in programs "+ args.length);
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}