public class EvenNumTest
{

    public static boolean isEven(int number)
    {
        if(number%2==0)

            return true;
        else
            return false;

    }
    public static void main(String[]arg)
    {
        boolean var=EvenNumTest.isEven(34);
        boolean var1=EvenNumTest.isEven(33);

        System.out.println("value returned is "+" "+var+" , "+"yes it is an even number");
        System.out.println("value returned is "+" "+var1+" ,  "+"no it is not an even number");


    }
}
