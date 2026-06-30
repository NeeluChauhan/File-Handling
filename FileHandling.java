package FIleHandling;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        File file = new File("name.txt");
        try {
            BufferedReader bf = new BufferedReader(new FileReader("name.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                if (!line.isEmpty()) {
                   String[] data= line.split(" ");
                }
            }
            bf.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}