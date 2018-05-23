package com.day3Java;

public class Main {

    public static void main(String[] args) {
	    CheckingAccount ca = new CheckingAccount();

        SavingsAccount sa = new SavingsAccount(10000);
        System.out.println("account name: " + sa.getName());

        System.out.println("initial amount: " + sa.getBalance());

        sa.deposit(5000);

        System.out.println("new amount after deposit: " + sa.getBalance());

        CheckingAccount ca2 = new CheckingAccount(20000);

        System.out.println("account name: " + ca.getName());

        System.out.println("initial amount: " + ca.getBalance());

        ca.deposit(6000);

        System.out.println("new amount after deposit: " + ca.getBalance());

        ca.withdraw(3000);

        System.out.println("new amount after withdrawal: " + ca.getBalance());




    }
}
