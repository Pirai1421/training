
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        return Integer.compare(this.age, st.age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Vijay", 23),
                new Student("Ajay", 27),
                new Student("Jai", 21)
        );

        students.sort((Student s1, Student s2) -> Integer.compare(s1.age, s2.age));

        for (Student st : students) {
            System.out.println(st);
        }
    }
}
record Alien(int id){ }

