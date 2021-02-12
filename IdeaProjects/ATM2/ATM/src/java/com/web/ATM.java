package com.web;

import java.util.Scanner;

public class ATM implements BankService {
    Bank bank;
    Account account;
    Scanner in;
    public ATM(Bank bank) {
        this.bank = bank;
        in = new Scanner(System.in);
    }
    public void start() {
        int cardNumber;
        int pin;

        System.out.println("Enter card number:");
        cardNumber = in.nextInt();

        System.out.println("Enter pin code:");
        pin = in.nextInt();

        if (this.bank.verifyUser(cardNumber, pin) != null) {
            this.setAccount(this.bank.verifyUser(cardNumber, pin));
            System.out.println("Hello, " + account.getName() + "!\n\n");
            mainMenu();

        } else
            System.out.println("ERROR!!!");
    }

    public void mainMenu() {
        int n;

        while (true) {
            System.out.println("1.Show balance\n2.WithDraw\n3.TopUp\n4.Exit");

            n = in.nextInt();

            if (n == 1) {
                checkBalance();
            }
            else if (n == 2 || n == 3) {
                System.out.println("Enter value: ");
                double money = in.nextDouble();
                if(n == 2) withDraw(money);
                else if(n == 3) topUp(money);
            }
            else System.exit(0);
        }
    }

    @Override
    public void checkBalance() {
        System.out.println(this.account.getMoney());
    }
    @Override
    public void withDraw(double value) {
        this.bank.funcWithdraw(this.account.getId(), value);
    }
    @Override
    public void topUp(double value) {
        this.bank.funcTopUp(this.account.getId(), value);
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean checkPIN() {
        return false;
    }

    @Override
    public void changePIN() {

    }
}
