package com.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank{
    List<Account> accountList;
    public Bank(List<Account> accountList) {
        this.accountList = accountList;
    }
    public void addAccount(Account account) {
        this.accountList.add(account);
    }
    Scanner sc = new Scanner(System.in);

    public Account getUser(int id) {
        for (Account acc : this.accountList) {
            if (acc.getId() == id)
                return acc;
        }
        System.out.println("ERROR! This user doesn't exist!");
        return null;
    }
    public Account verifyUser(int id, int pin) {
           for (Account acc : this.accountList) {
           if (acc.getCardNumber() == id && acc.getPIN() == pin)
               return acc;
           }
            return null;
        }
    public void funcWithdraw(int id, double value) {
        Account user = this.getUser(id);

        if (value <= user.getMoney()) {
            user.setMoney(user.getMoney() - value);
            System.out.println("Success!");
        } else {
            System.out.println("ERROR!");
        }
    }

    public void funcTopUp(int id, double value) {
        Account user = this.getUser(id);

        if (value <= 1000000) {
            user.setMoney(user.getMoney() + value);
            System.out.println("Success!");
        } else {
            System.out.println("ERROR!");
        }
    }
}
