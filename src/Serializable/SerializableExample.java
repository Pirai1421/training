package Serializable;
import java.io.*;
class Student implements Serializable{
    private String name;
    private int id;

    public String getName() {
        return name;
    }
    public int getid() {
        return id;
    }

    public Student(String name,int id){
        this.name=name;
        this.id=id;


    }


}

public class SerializableExample{
    public static void main(String[] args) {
        Student s = new Student("pirai", 1);
        try {
            FileOutputStream fo = new FileOutputStream("student.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(s);
            System.out.println("object has been serialized");
            oo.close();
            fo.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }


        try {
            FileInputStream fi = new FileInputStream("student.txt");
            ObjectInputStream Oi = new ObjectInputStream(fi);
            Student ds = (Student) Oi.readObject();
            System.out.println("object has been deserialized");
            System.out.println("name: " + ds.getName());
            System.out.println("ID: " + ds.getid());
            fi.close();
            Oi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
