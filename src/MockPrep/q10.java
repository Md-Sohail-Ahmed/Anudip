package MockPrep;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

class Bank implements Runnable{
    int balance=1000;
    int amount;
    Bank(int amount){
        this.amount=amount;
    }
    synchronized public void run(){
        if(amount>balance){
            System.out.println("insufficient balance");
        }else{
            balance-=amount;
            System.out.println("remaning balance : "+balance);
        }

    }
}

public class q10 {
    public static void main(String[] args) {
        Bank b=new Bank(700);
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);

        t1.start();
        t2.start();
    }
}
