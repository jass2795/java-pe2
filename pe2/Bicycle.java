public class Bicycle
{
    int speed;
    int cadence;
    int gear;

    public void  setCadence(int newvalue)
    {
System.out.println("entered in setcadence method"+ " "+newvalue);
    }
    public void setGear(int newvalue)
    {
        System.out.println("entered in setGear method"+ " "+newvalue);
    }
    public void speedUp(int inc)
    {
        System.out.println("entered in speedUp method"+ " "+inc);
    }
    public void speedDown(int dec)
    {
        System.out.println("entered in speedDown method"+ " "+dec);
    }
    Bicycle(int startC,int startG,int startSpeed)
    {

cadence=startC;
gear=startG;
speed=startSpeed;
System.out.println("cadence is"+ " "+cadence+" "+ "gear is "+" "+gear+" "+"present speed is"+ " "+speed);
    }


    public static void main(String[]args)
    {
      Bicycle bb=new Bicycle(56,34,67);
      bb.setCadence(78);
      bb.setGear(56);
      bb.speedUp(89);
      bb.speedDown(78);

    }
}