package com.web;

public class Account {
    private String name, surname;
    private int id, cardNumber, phoneNumber,PIN,cardDate;
    private double money;

    public Account(int id, String name, String surname, int cardNumber, int phoneNumber, int PIN, int cardDate, double money) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
        this.PIN = PIN;
        this.cardDate = cardDate;
        this.money = money;
    }

    public int getId() {
        return id;
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

    public double getMoney() {
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

    public void setMoney(double money) {
        this.money = money;
    }
}
