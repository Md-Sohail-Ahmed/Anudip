package MockPrep;

class ThreadInfo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
    }
}

public class q9 {
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadInfo());
        Thread t2=new Thread(new ThreadInfo());
//        t1.setPriority(10);
        t1.start();
        t2.start();
    }

}
