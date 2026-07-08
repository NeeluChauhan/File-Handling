package FIleHandling;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("name.txt");
        try {
            BufferedReader br= new BufferedReader(new FileReader("name.txt"));
                BufferedWriter bw= new BufferedWriter(new FileWriter("copy.txt"));
                String line;
                while ((line= br.readLine())!=null){
                    bw.write(line);
                    bw.newLine();
                }
                bw.close();
                br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}