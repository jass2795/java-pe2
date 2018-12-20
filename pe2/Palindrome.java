public class Palindrome
{


    public void getDisplay(int num)
    {
        int num1;
        int rem;
        int sum=0;
        int temp;
         temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;

        }
        if(temp==sum)
        {
            System.out.println("Success: Yes it is a palindrome");
        }
        else
        {
            System.out.println("Failure: No it is not a palindrome");
        }
    }
    public static void main(String[]args)
    {
        Palindrome pd=new Palindrome();
        pd.getDisplay(234);
        pd.getDisplay(656);
    }
}
