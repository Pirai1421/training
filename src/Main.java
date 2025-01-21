import java.util.*;

interface Writer{
    public abstract void write();
}
class Hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
        }
    }
}
class Pen implements Writer{
    @Override
    public void write() {
        String name="pirai";
        System.out.println("hello "+name);

        
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Writer p=new Pen();
        p.write();
        Hello j=new Hello();
        j.start();
        Hi h =new Hi();
        h.start();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        

        
    }
}