import java.util.Scanner;

class myexception extends Exception{
    myexception(String msg){
        super(msg);
    }
}
public class throwkeyword{
public static void main(String[] args) {
int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age for voterid card");
   age= sc.nextInt();
    try{
    if(age<18){
        throw new myexception("You are not eligible i.e you are underage");

    }
    else if(age>100)
    {
        System.out.println("You don't need a voter id, you need a death certificate ASAP");
    }
    else
    {
        System.out.println("You successfully registered");
    }
}
catch(myexception m)
{
   m.printStackTrace();
}
System.out.println("Program Ended");
}
}