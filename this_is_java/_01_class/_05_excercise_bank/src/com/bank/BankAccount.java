package com.bank;

import java.util.Random;

public class BankAccount {
    
    // 필드
    private final String accountNumber;
    private String ownerName;
    private int balance;
    private String accountType;
    private static float interestRate;
    private static int totalAccounts;


    // 생성자
    public BankAccount() {
        this(generateAccountNumber(), "Unknown", "예금");
    }

    public BankAccount(String ownerName, String accountType) {
        this(generateAccountNumber(), ownerName, accountType);
    }

    public BankAccount(String accountNumber, String ownerName, String accountType) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountType = accountType;
        BankAccount.totalAccounts++;
    }


    // 메소드
    private static String generateAccountNumber() {
        StringBuilder accountNumber = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }

    public void displayAccountInfo() {
        System.out.println("=============================");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("이름: " + ownerName);
        System.out.println("잔액: " + balance);
        System.out.println("계좌유형: " + accountType);
        System.out.println("=============================");
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static float getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(float num) {
        interestRate = num;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("올바른 금액을 입력하세요.");
        } else if (amount + balance <= 1000000000) {
            balance += amount;
            System.out.println("입금완료. 잔액: " + balance);
        } else {
            System.out.println(String.format("입금 가능 금액(%d)을 초과했습니다.", 1000000000-balance));
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("올바른 금액을 입력하세요.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("출금완료. 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }
}
