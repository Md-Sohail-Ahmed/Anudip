package problmes;

class Restaurant{
    private boolean orderPlaced=false;
    private boolean foodReady=false;
    private String orderName;
    public synchronized void foodOrder(String orderName){
        this.orderName=orderName;
        System.out.println("waiter: customer gives order-> "+ orderName);

        orderPlaced=true;
        notifyAll();
    }

    public synchronized void cookedOrder(String cookName){
        while(!orderPlaced){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("cook("+cookName+"): received the order");
        System.out.println("cook("+cookName+"): cooking "+orderName);
        foodReady=true;
        notifyAll();
    }

    public synchronized void recOrder(String customerName){
        while(!foodReady){
            try{
                wait();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("customer("+customerName+"): received the order "+orderName);
    }
}

class Customer extends Thread{
    Restaurant r;
    Customer(Restaurant r){
        this.r=r;
    }
    public void run(){
        System.out.println("customer : choosing order.....");
        r.recOrder("sohail");
    }
}

class Waiter extends Thread{
    Restaurant r;
    Waiter(Restaurant r){
        this.r=r;
    }
    public  void run(){
        r.foodOrder("Biryani");
    }
}

class Cook extends Thread{
    Restaurant r;
    Cook(Restaurant r){
        this.r=r;
    }
    public void run(){
        r.cookedOrder("Mayur");
    }
}

public class RestaurantTest {
    public static void main(String[] args){
        Restaurant r=new Restaurant();

        Customer c=new Customer(r);
        Waiter w=new Waiter(r);
        Cook C=new Cook(r);

        C.start();
        w.start();
        c.start();
    }
}
