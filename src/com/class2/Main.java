package com.class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        int choose;

        do {
            System.out.println("1. Create a Account ");
            System.out.println("2.Deposit or Withdraw Money ");
            System.out.println("3. Exit");
            System.out.println("Choose menu: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                        account.addNewPerson();
                }
                break;
                case 2: {
                    account.depositAndWithdraw();
                }
                break;
                case 3: {
                    System.out.println("Close application");
                    return;
                }
            }
        } while(true);
    }
}

