package FIleHandling;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileInputStream fis= new FileInputStream("Neelu_Chauhan_Resume.pdf");
            FileOutputStream fos= new FileOutputStream("Neelu_Chauhan_Resume_copy.pdf");
            int data;
            while ((data=fis.read())!=-1){
                fos.write(data);
            }
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}