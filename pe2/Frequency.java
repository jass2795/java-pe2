import java.io.*;

public class Frequency {
    public static void main(String[] args) throws Exception {
        String line;
        int countWord = 0;

        File file = new File("C:\\Users\\JasleenKaur\\IdeaProjects\\first_project\\src\\FileDemo.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {


                String[] wordList = line.split("\\s+");

                countWord += wordList.length;
            }

        }
        System.out.println("Total word count = " + countWord);
    }
}