class consoverload
{
    consoverload(int a)
    {
System.out.println("The  value of a is "+a);
    }
    consoverload(int a, int b)
    {
        System.out.println("The value of a is "+a+ " The value of b is "+b);
    }
}
class ConstructorOverload
{
    public static void main(String[] args) {
        consoverload co= new consoverload(45,85);
    }
}