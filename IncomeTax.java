import java.util.*;
public class IncomeTax {
    public static  void main(String[]args)
    {
        int tax;
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income<500000)
        {
            System.out.println("No Tax");
        }
        else if(income>=500000&&income<=1000000)
        {
            tax = (int) (income*(0.2));
            System.out.println("Tax is of 20 Percentage"+tax);
        }
        else
        {
            tax = (int)(income*(0.3));
            System.out.println("Tax is of 30 Percentage"+tax);
        }



    }
}
