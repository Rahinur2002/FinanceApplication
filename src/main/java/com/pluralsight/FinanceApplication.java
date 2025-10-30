package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ray", "54222", 12500);
        Valuable account2 = new BankAccount("Rah", "59940", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        //account2.deposit(100);

        System.out.println(account1);
        //System.out.println(account2);
    }
}
