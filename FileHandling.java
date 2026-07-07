package FIleHandling;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {

        File file = new File("name.txt");
        try {
            BufferedReader bf = new BufferedReader(new FileReader("name.txt"));
            String line;
            String longestLine= "";
            int length=0;
            while ((line = bf.readLine()) != null) {
                if (line.length()>length) {
                    longestLine= line;
                    length= line.length();
                }
            }
            System.out.println("Longest line is " +longestLine);
            System.out.println("It's length is: " +length);
            bf.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}