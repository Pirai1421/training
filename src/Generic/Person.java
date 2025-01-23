package Generic;

public class Person<T> {
    T name;
    T age;
    public void setName(T name){
        this.name=name;
    }
    public T getName(){
        return this.name;
    }
    public void setAge(T age){
        this.age=age;

    }
    public T getAge(){
        return this.age;
    }
}
