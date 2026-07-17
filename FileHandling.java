package FIleHandling;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling implements Serializable {
int id;
String name;
String designation;
double salary;
FileHandling(int id, String name, String designation, double salary){
    this.id=id;
    this.name= name;
    this.designation=designation;
    this.salary= salary;
}
public void displayDetails(){
    System.out.println("Employee id: " +id);
    System.out.println("Employee name: " +name);
    System.out.println("Employee designation: " +designation);
    System.out.println("Employee salary: " +salary);
    System.out.println("----------------------------------");
}
    public static void main(String[] args) {
    FileHandling fileHandling= new FileHandling(123, "Neelu chauhan", "Consultant", 40000);
    FileHandling fileHandling1= new FileHandling(124, "Prabhat chauhan", "Software engineer", 80000);
    FileHandling fileHandling2= new FileHandling(125, "Ankit kumar chauhan", "Senior data analyst", 90000);
        try {
            FileOutputStream fos= new FileOutputStream("C:\\Users\\prabh\\IdeaProjects\\NeeluC\\src\\FIleHandling\\Employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fileHandling);
            oos.writeObject(fileHandling1);
            oos.writeObject(fileHandling2);
            oos.close();
            fos.close();
            FileInputStream fis= new FileInputStream("C:\\Users\\prabh\\IdeaProjects\\NeeluC\\src\\FIleHandling\\Employee.ser");
           ObjectInputStream ois= new ObjectInputStream(fis);
            fileHandling.displayDetails();
            fileHandling1.displayDetails();
            fileHandling2.displayDetails();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
