package Polymorphism;

public class Polymorphism {
    public static void main(String[] args){
        B b=new B();
        b.show();
        b.hello(5,7);
    }
}
class A{
    public void show(){
        System.out.println("in class A");


    }
    public void hello(int i,int b){
        System.out.println("age "+": "+(i+b)+"method Overloading");
    }
}
class B extends A{
    public void show(){
        super.show();
        System.out.println("in class B Method  overriding");
    }
    public void hello(int i){
        System.out.println("age"+": "+i);
    }
}
