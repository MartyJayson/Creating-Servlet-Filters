package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements BankService{
    ArrayList<Account> accountList = new ArrayList<Account>();
    Account acc1 = new Account("Ivan","Ivanov",777,5553555,1234,10/22,5000);
    Scanner sc = new Scanner(System.in);

    @Override
    public boolean checkPIN() {
        int PIN = sc.nextInt();
        if(acc1.getPIN() == PIN) return true;
        else return false;
    }

    @Override
    public void changePIN() {
        System.out.println("Write your new PIN:");
        int newPIN = sc.nextInt();
        System.out.println("Write your new PIN again:");
        int newPIN2 = sc.nextInt();
        if(newPIN == newPIN2){
            acc1.setPIN(newPIN);
            System.out.println("PIN changed successfully!");
        }
        else System.out.println("Your PIN codes are different!");

    }

    @Override
    public void checkBalance() {
        System.out.println("Your balance: $" + acc1.getMoney());
    }

    @Override
    public void withDraw() {
        System.out.println("How much you want withdraw?");
        int withdraw = sc.nextInt();
        int possible = acc1.getMoney() - withdraw;
        if(possible >= 0){
            acc1.setMoney(possible);
            System.out.println("Your balance: $" + acc1.getMoney());
        }
        else System.out.println("Not enough money!");
    }

    @Override
    public void topUp() {
        System.out.println("How much you want top up?");
        int topup = sc.nextInt();
        int sum = acc1.getMoney() + topup;
        acc1.setMoney(sum);
        System.out.println("Your balance: $" + acc1.getMoney());

    }
}
