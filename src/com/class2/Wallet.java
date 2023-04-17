package com.class2;

public class Wallet {
    long amount;
    Wallet(){
        this.amount = 0;
    }
    long money;
    public void deposit(long money) {
        this.amount += money;
    }
    public void withdraw(long money) {
        this.amount -= money;
    }
    public void depositAndWithdraw(long money, int type){
        this.money=money;
        if (type==0){
            System.out.println("Enter money");
            deposit(money);
        } else if (type==1) {
            System.out.println("Enter money");
            withdraw(money);
        }
    }
}
