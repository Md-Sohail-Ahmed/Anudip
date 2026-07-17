package in.multithread;

public class ExampleForMultiThreading  implements Runnable{

    public void run()
    {
        String name = Thread.currentThread().getName();

        try{
            System.out.println(name + " is executing first line");
            Thread.sleep(4000);
            System.out.println(name + " is executing second line");
            Thread.sleep(4000);
            System.out.println(name + " is executing third line");
            Thread.sleep(4000);
            synchronized (this) {
                System.out.println(name + " is executing fourth line");
                Thread.sleep(4000);
                System.out.println(name + " is executing fifth line");
                Thread.sleep(4000);
            }
            System.out.println(name + " is executing sixth line");
            Thread.sleep(4000);
            System.out.println(name + " is executing seventh line");
            Thread.sleep(4000);
        }
        catch(Exception e)
        {
            System.out.println("Some problem occurred");
        }
    }
    public static void main(String[] args)
    {
        ExampleForMultiThreading e = new ExampleForMultiThreading();
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(e);

        t1.setName("Noorain");
        t2.setName("Nafiya");

        t1.start();
        t2.start();
    }
}