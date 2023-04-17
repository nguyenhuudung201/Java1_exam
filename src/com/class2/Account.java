package com.class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    List<Person> list;
    long money;
    int type;
    public Account() {
        list = new ArrayList<Person>();
    }
    public void addNewPerson() throws Exception {
        Person newPerson = null;
        newPerson= new Personlist();
        newPerson.input();
        System.out.println("Your accNumber: "+newPerson.getId());
        list.add(newPerson );
    }
    Person findPersonById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();
        for (Person item : list) {
            if (findId == item.getId()) {
                return item;
            }
        }
        return null;
    }
    public void depositAndWithdraw() {
        Person findShape = this.findPersonById();
        if (findShape != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to  Withdraw ");
            System.out.println("Enter 0 to  deposit ");
            type=sc.nextInt();
            findShape.depositAndWithdraw(type);
        } else {
            System.out.println("Not found");
        }
    }
}
