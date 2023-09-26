package MYPACK;
interface mycamera{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("recording 4k video.........");
    }
}
interface mywifi{
    String[] getnetwork();
    void connect_To_network(String network);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling "+phonenumber);
    }
    void pickcall(){
        System.out.println("connectiong.... ");
    }
}
class mysmartphone extends mycellphone implements mywifi,mycamera{
      public  void takesnap(){
           System.out.println("taking snap");
   }
   public  void recordvideo(){
    System.out.println("video recorded.");
}
public String[] getnetwork(){
    System.out.println("getting list of network");
    String [] networklist={"Harry","akash","aman"};
    return networklist;
}
public void connect_To_network(String network)
{
    System.out.println("connecting to "+network);
}

}
public class default_method_interface {
    public static void main(String[] args) {
       mysmartphone ms=new mysmartphone();
      String [] ar= ms.getnetwork();
      for (String aman : ar) {
          System.out.println(aman);
      } 
      ms.record4kvideo();       
    }
}