package threading;

public class Thread2 implements Runnable {//THIS METHOD IS BETTER WHEN COMPARED TO THE EXTENDING THE THREAD CLASS BECAUSE
    //IMPLEMENTATION CAN BE USED TO EXTEND ANOTHER CLASS OR IMPLEMENT MULTIPLE INTERFACES


    @Override
    public void run() {
        System.out.println(" hello");

    }

}
