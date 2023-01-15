// print the largest of 2 numbers
/*public class control {
    public static  void main(String[]args)
    {
     int a = 12;
     int b = 15;
     if(a>b)
     {
         System.out.println("a is greater");
     }
     else
     {
         System.out.println("B is greater");
     }
    }

}*/

// CHECK WETHER THE NUMBER IS EVEN OR ODD
import java.util.*;
public class control {
    public static  void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
           System.out.println("Odd");

        }
    }
}