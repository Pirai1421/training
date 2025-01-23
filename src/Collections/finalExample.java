package Collections;

public class finalExample {
    public static void main(String[] args){
        final int i =10;
        System.out.println(i);
        AdvCal c=new AdvCal();
        c.add(4,5);
        c.show(9,8);

    }
}
class Cal{
    public final static void show(int a ,int b){
        System.out.println("the answer is "+ Cal.add(a,b));

    }
    public static int add(int a, int b){
        System.out.println(a+b);
        return (a+b);
    }
}
final class AdvCal extends Cal{
    public final static void showAns(){
        System.out.println("the answer for ");

    }
}
