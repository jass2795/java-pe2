import java.util.*;

public class Student
{

    public void getMin(int arr[],int num)
    {
        int i; //for traversal
        int min=arr[0];

        for(i=0;i<num;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("minimum grade is"+" "+min);

    }
    public void getMax(int arr[],int num)
    {
        int j; //for traversal
        int max=arr[0];
        for(j=0;j<num;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }
        }
        System.out.println("maximum grade is"+" "+max);
    }
    public void getAverage(int arr[],int num)
    {
       int i;
       float avg;


       int temp=0;
        for(i=0;i<num;i++)
        {
            temp=arr[i]+temp;
        }
        avg=temp/num;
        System.out.println("average is "+" "+avg);
    }
    public static void main(String[]args)
    {
        int i;
        int arr[]=new int[20];
        Student std=new Student();
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number of students");
        int num=scn.nextInt();

        for(i=0;i<num;i++)
        {
            System.out.println("enter the grade for student"+" "+i);
            arr[i]=scn.nextInt();
        }
        System.out.println("grades entered by you are"+" ");
        for(i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }

        std.getAverage(arr,num);

        std.getMin(arr,num);
        std.getMax( arr,num);


    }
}
