package FIleHandling;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("name.txt");
        try {
            Scanner sc= new Scanner(file);
            while (sc.hasNext()){
                if (sc.hasNextInt()) {
                    int num = sc.nextInt();
                    System.out.println(num);
                }
                else{
                    sc.next();
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
        }
    }
}