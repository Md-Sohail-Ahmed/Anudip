package com.exception;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{

}

class MinBalanceException extends Exception{

}
class Account{
    private double Balance;
    private double minBalance=1000;
    public Account(double Balance){
        this.Balance=Balance;
    }

    public void withdraw(double amount){
        try{
            if(Balance<amount && (Balance-amount)<minBalance){
                throw new InsufficientBalanceException();
            }else{
                Balance-=amount;
                System.out.println(amount + " withdrawal successful");
            }
        }catch (InsufficientBalanceException exc){
            System.out.println("Insufficient Balance");
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter initial balance: ");
        double balance=s.nextInt();

        System.out.println("enter withdrawal amount: ");
        double amount=s.nextInt();

        Account a=new Account(balance);
        a.withdraw(amount);
    }
}
