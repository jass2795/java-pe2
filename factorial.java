import java.util.*;

public class factorial
{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("number that can be expressed as int factorials");

        int i=0,fact=1;
        int num=13;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
System.out.println(fact);

    }
}
