package com.web;

public interface BankService {
    public boolean checkPIN();
    public void changePIN();
    public void checkBalance();
    public void withDraw(double value);
    public void topUp(double value);

}
