package com.src;
public class BankAccount {

    public static void main(String[] args) {
        Account ac = new Account("venu","46","axis");
        System.out.println(ac.display());

        SavingsAccount sa=  new SavingsAccount("venu","46","axis","kotak");
        System.out.println(sa.display());

    }
}

