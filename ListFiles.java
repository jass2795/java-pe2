import java.io.*;


public class ListFiles
{
    public void listFiles(String directoryName)
    {
        File directory = new File(directoryName);

        File[] fList = directory.listFiles();     //get all the files from a directory

        for (File file : fList)
        {
            if (file.isFile())
            {
                System.out.println("file name is"+" "+file.getName());
            }
        }
    }

    public void readFile()
    {
        try {


            FileInputStream f2 = new FileInputStream("C:\\Users\\JasleenKaur\\Desktop\\helllo\\assign.html");

            int b;
            System.out.println("this is the content of the file");

            byte buf[]=f2.toString().getBytes();
            System.out.println(f2.read(buf));
            //while((b=f2.read())!=-1)
            //{
              //  System.out.print((char)b);
            //}


        }
        catch(Exception exc)
        {

        }
    }



    public static void main(String[]arg)
    {
     ListFiles lf=new ListFiles();

     lf.listFiles("C:\\Users\\JasleenKaur\\Desktop\\helllo");
     lf.readFile();


    }
}

