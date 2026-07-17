package problmes;

class NumberPrinter {
    int num = 1;
    int max = 10;

    public synchronized void print(int remainder) {
        while (num <= max) {

            while (num % 3 != remainder && num <= max) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            if (num <= max) {
                System.out.println(num);
                num++;
                notifyAll();
            }
        }
    }
}

class PrintTask implements Runnable {

    private NumberPrinter obj;
    private int remainder;

    public PrintTask(NumberPrinter obj, int remainder) {
        this.obj = obj;
        this.remainder = remainder;
    }

    public void run() {
        obj.print(remainder);
    }
}

public class Printer {

    public static void main(String[] args) {

        NumberPrinter obj = new NumberPrinter();

        Thread t1 = new Thread(new PrintTask(obj, 1));
        Thread t2 = new Thread(new PrintTask(obj, 2));
        Thread t3 = new Thread(new PrintTask(obj, 0));

        t1.start();
        t2.start();
        t3.start();
    }
}