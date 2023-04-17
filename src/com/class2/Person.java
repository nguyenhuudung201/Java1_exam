package com.class2;

import java.util.Scanner;

public abstract class Person {
    String customerCode;
    String customerName;
   int accNumber;
    long money;
    long amount;
    int type;
    Wallet wallet;
    public Person(){
        this.wallet = new Wallet();
    }
    public abstract void input() throws Exception;
    public int getId() {
        return accNumber;
    }
    public void setId(int id) {
        this.accNumber= id;
    }
    public void deposit(long money) {
        this.amount += money;
    }
    public void withdraw(long money) {
        this.amount -= money;
    }
    public void depositAndWithdraw(int type){
        long money;

        if (type==0){
            System.out.println("Enter money deposit");
            Scanner input = new Scanner(System.in);
            this.money=money=input.nextInt();
            deposit(money);
        } else if (type==1) {
            System.out.println("Enter money Withdraw");
            Scanner input = new Scanner(System.in);
            this.money=money=input.nextInt();
            withdraw(money);
        }
    }
    
}
