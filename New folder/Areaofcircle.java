import java.util.Scanner;
public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius");
        int r= sc.nextInt();
        System.out.println("Area of cicle is= "+2*3.14*r);
        sc.close();
    }
}
