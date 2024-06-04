
package SIAT;

import java.util.*;

 class Bank{
    int amount=10000;
    public void withdraw(int amount) throws InterruptedException{

        if(this.amount<amount){
            System.out.println("NO SUFFICENT BALANCE");
            wait();
        }
        this.amount-=amount;
        System.out.println("BALANCE: "+this.amount);
    }
    public void deposit(int amount){
        System.out.println("READY FOR DEPOSIT");
        this.amount+=amount;
        System.out.println("NOW BALANCE : "+this.amount);
        notifyAll();
    }
}

public class BANKdeposit {
    public static void main(String[] args){
        Bank b=new Bank();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE WITHDRAW AMOUNT: ");
        int amount=sc.nextInt();
        new Thread(){
            public void run(){
            try {
                b.withdraw(amount);
            } catch (InterruptedException e) {
                                e.printStackTrace();
            }
            }
        }.start();
        
        int dep=sc.nextInt();
        new Thread(){
            public void run(){
            b.deposit(dep);
            }
        }.start();


    }
}
