package in.multithread;

class AvgThread extends Thread{
    public  void run(){
        int sum=0;
        for(int i=0;i<=10;i++){
            sum+=i;
        }
        double avg=sum/10.0;
        System.out.println("average of 10 numbers is: "+avg);
    }
}

class Square extends Thread{
    int[] arr ={1,2,3,4,5};
    public  void run(){
        System.out.println("square are:");
        for (int j : arr) {
            System.out.println("Square of: " + j + "=" + (j * j));
        }
    }
}
public class Avg {
   public static void main(String[] args) {
       AvgThread t1=new AvgThread();
       Square t2=new Square();

       try{
           t1.start();
           t1.join();

           t2.start();
           t2.join();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }


   }
}
