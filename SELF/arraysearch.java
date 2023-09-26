import java.util.Scanner;

class array
{ int flag, i;
    int m[]={1,2,3,4,5,6,7,8,9};
    void show()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter element you want to find");
        int x=sc.nextInt();
        for(i=0;i<9;i++)
        {
            if(m[i]== x)
            {
flag=1;
break;
            }
            else
            {
                flag=0;
            }
        }
            if(flag==1)
            {
                System.out.println("Element found at position: "+(i + 1));
            }
            else{
                System.out.println("Element not found");
            }
        }
    }

class arraysearch
{
    public static void main(String[] args) {
        array ar= new array();
        ar.show();
    }
}