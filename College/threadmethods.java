class A extends Thread{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            if(i==1) 
            Thread.yield(); // it stop the currently executing thread and will give a chance to other waiting threads of same priority
            System.out.println("From Thread A: i = " + i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=1; j<=5; j++)
        {
            System.out.println("From Thread B: j= " + j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k=1; k<=5; k++)
        {
            System.out.println("From Thread C: k= " + k);
            if(k==1)
            try
            {
                sleep(1500); // it make the thread sleep/stop working for a specific period of time
            }
            catch(Exception e)
            {

            }
        }
        System.out.println("Exit from C");
    }
}
class threadmethods
{
    public static void main(String[] args) {
        A threadA =new A();
        B threadB= new B();
        C threadC= new C();
        System.out.println("Start Thread A");
        threadA.start(); // Used to begin Execution
        System.out.println("Start Thread B");
        threadB.start();
        System.out.println("Start Thread C");
        threadC.start();
        System.out.println("End of Main Thread");
    }
}