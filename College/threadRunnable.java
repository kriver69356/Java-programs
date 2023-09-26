class mythread implements Runnable
{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Child thread");
        }
    }
}
class threadRunnable
{
    public static void main(String[] args) {
        mythread m= new mythread();
        Thread t1= new Thread(m);
        t1.start();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}