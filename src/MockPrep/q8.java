package MockPrep;

class Print implements Runnable{
    int start;
    int end;
     Print(int start, int end){
        this.start=start;
        this.end=end;
     }

    public void run(){
        System.out.print(Thread.currentThread().getName()+":");
        for(int i=start;i<=end;i++){
            System.out.print(i+"");
        }
        System.out.println();
    }

}

public class q8 {
    public static void main(String[] args){
        Print p1=new Print(1,5);
        Print p2=new Print(6,10);

        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
