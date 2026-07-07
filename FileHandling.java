package FIleHandling;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("name.txt");
        try {
            BufferedWriter bw= new BufferedWriter(new FileWriter("name.txt", true));
            for (int i=1;i<=100;i++){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}