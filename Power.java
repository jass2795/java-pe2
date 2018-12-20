import java.util.*;

public class Power
{

    public int checkPower(int number)
    {
        if(number==0)
        {
            return 0;
        }
        else
        {
            while(number!=1)
            {
                if(number%4!=0)
                {
                    return 0;
                }
                else
                {
                    number=number/4;
                }
            }
            return 1;
        }
    }




    public static void main(String[]args)
    {
        Power fc=new Power();
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scn.nextInt();
        int result=fc.checkPower(num);

        if(result==1)
            System.out.println("yes..its a power of 4");
        else
            System.out.println("no..its not a power of 4");

    }
}
