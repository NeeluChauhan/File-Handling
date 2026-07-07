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
            int count=0;
            while ((line = bf.readLine()) != null) {
                if (line.isEmpty()) {
                   count++;
                }
            }
            System.out.println("Empty lines: " +count);
            bf.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}