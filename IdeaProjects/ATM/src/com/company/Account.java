package com.company;

public class Account {
    String name, surname;
    int cardNumber, phoneNumber,PIN,cardDate,money;

    public Account(String name, String surname, int cardNumber, int phoneNumber, int PIN, int cardDate, int money) {
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
        this.PIN = PIN;
        this.cardDate = cardDate;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getPIN() {
        return PIN;
    }

    public int getCardDate() {
        return cardDate;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public void setCardDate(int cardDate) {
        this.cardDate = cardDate;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
