package threading;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main is starting");
        Thread thread1=new Thread1("thread 1");
        thread1.setDaemon(true);

        thread1.start();
        thread1.join();

        Thread thread2=new Thread(()-> {
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread()+","+i);
            }
        },"thread2");
        thread2.start();
        thread2.join();
        System.out.println("main is exiting");
    }
}
