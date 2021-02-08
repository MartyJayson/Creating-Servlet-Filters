package com.company;

import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        bank.accountList.add(bank.acc1);
        int tries = 3;
        while (true){
        System.out.print("Enter your PIN:");
        if(bank.checkPIN()){
            System.out.println("What do you want?");
            System.out.println("1.Change PIN\n2.Check balance\n3.Withdraw\n4.Top Up");
            int n = sc.nextInt();
            if(n == 1){
            bank.changePIN();
            }
            if(n == 2){
            bank.checkBalance();
            }
            if(n == 3){
                bank.withDraw();
            }
            if(n == 4){
                bank.topUp();
            }
        }
        else {
            System.out.println("Wrong PIN!");
            tries--;
            if(tries == 0)
                System.exit(0);
            }
        }
    }
}
