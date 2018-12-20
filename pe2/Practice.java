public class Practice
{
    int x,y;

    public void getDisplay(int x,int y)
    {
        this.x=x;
        this.y=y;

        System.out.println("values are "+x + " "+y);
    }
    public static void main(String[]args)
    {
        Practice pp=new Practice();
        pp.getDisplay(23,56);
    }
}
