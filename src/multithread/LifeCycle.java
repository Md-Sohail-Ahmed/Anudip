package in.multithread;

class Test implements Runnable{
    static Object lock=new Object();
    public void run(){
        try{
            synchronized (lock){
                System.out.println("Tread Started");
                Thread.sleep(3000);

                System.out.println("Tread waiting");
                lock.wait();

                System.out.println("Thread Resumed");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class LifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Test t=new Test();
        Thread T=new Thread(t);

        T.start();

        Thread.sleep(4000);

        synchronized (Test.lock){
            Test.lock.notify();
        }
        T.join();
        System.out.println("All Set");
    }
}
