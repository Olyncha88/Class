package com.company;

public class CreditCard {
    int accountNumber;
    double currentSum;

    public CreditCard(int accountNumber, double currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    // пополнение карты
    public double replCard (double replAmount) {
        currentSum = currentSum + replAmount;
        return currentSum;
    }

    // снятие с карты
    public double withdrawFromCard (double cashAmount) {
        currentSum = currentSum - cashAmount;
        return currentSum;
    }
   }