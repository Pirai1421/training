package Inheritance;
class Animal{
    String name="Animal";
    public void show(){
        System.out.println(this.name);
    }

}
public class Inheritance_1 extends Animal {
    String name="dog";
    @Override
    public void show(){
        System.out.println(this.name);
    }
    public static void main(String[] args){
        Animal one=new Inheritance_1();
        one.show();
    }
}
