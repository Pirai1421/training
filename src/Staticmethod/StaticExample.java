package Staticmethod;
import java.util.*;
public class StaticExample {
    public static void main(String[] args){
        ArrayList<String> Pname=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        ArrayList<Person> persons=new ArrayList<>();
        ArrayList<Integer> PerAge=new ArrayList<>();

        for(int i=0;i<3;i++){
            Pname.add(s.nextLine());
            PerAge.add(s.nextInt());
            s.nextLine();
        }
        for(int i =0;i<Pname.size();i++) {
            String name=Pname.get(i);
            int age=PerAge.get(i);
            Person p1 = new Person(name,age);
            persons.add(p1);
            System.out.println("name"+p1.getName());
            System.out.println("age"+p1.getAge());
        }

    }
}
class Person{

    private final String name;
    private final int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;


    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
