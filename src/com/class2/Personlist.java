package com.class2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Personlist extends Person {
    Wallet wallet;
    public Personlist(){
        this.wallet = new Wallet();
    }
    @Override
    public void input() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customerCode");
        customerCode=input.nextLine();
        System.out.println("Enter customerName");
        customerName=input.nextLine();
        System.out.println("Enter accNumber");
        accNumber=input.nextInt();
        Pattern pattern = Pattern.compile("\\d{6}");
        try{
            System.out.print("Enter customer code: ");
            String code = input.nextLine();

            if(code.length() != 5) {
                throw new Exception("Code must be characters");
            }
            this.customerCode = code;

            System.out.print("Enter account number: ");
            String accNumber = input.nextLine();

            if(!accNumber.startsWith("100")) {
                throw new Exception("Account number must be start with 100");
            }

            Matcher matcher = pattern.matcher(accNumber);
            if(!matcher.matches()) {
                throw new Exception("Account number must be 6 digits");
            }


        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }


}
