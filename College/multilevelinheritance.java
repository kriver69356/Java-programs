class dog
{
    public void bark()
    {
 System.out.println("Dog is Barking");
    }
}
class eat extends dog
{
 public void eating()
 {
     System.out.println("Now he is eating");
 }
}
class run extends eat
{
 public void running()
 {
 System.out.println("and then he is Running");
 }
}
class multilevelinheritance
{
    public static void main(String[] args) {
        run r= new run();
        r.bark();
        r.eating();
        r.running();
    }
}