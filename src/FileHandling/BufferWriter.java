package FileHandling;

import java.io.*;


public class BufferWriter {
    public static void main(String[] args){
        try {
            FileWriter fwo = new FileWriter("newfile.txt");
            BufferedWriter bw = new BufferedWriter(fwo);
            bw.write("hello");
            bw.newLine();
            bw.close();
            System.out.println("successful");
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
