package FileHandling;
import java.util.*;
import java.io.*;
public class FileHandlingExample {
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("new.txt",true);
            fw.write("my 1st text");
            fw.close();
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println("something did not work");
        }

    }
}
