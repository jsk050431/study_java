package com.bank;

import java.util.ArrayList;

public class HanaBank {
    // 필드
    private static HanaBank instance = new HanaBank();
    private final static String bankName = "HanaBank";
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    // 생성자
    private HanaBank() {}

    // 메소드
    public static HanaBank getInstance() {
        return instance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setInterestRate(float num) {
        BankAccount.setInterestRate(num);
    }

    public void newAccount(BankAccount account) {
        accounts.add(account);
    }

    public void findAccountByNumber(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                account.displayAccountInfo();
                return;
            }
        }
        System.out.println("해당 계좌를 찾을 수 없습니다.");
    }
    
    public void depositToAccount(String accountNumber, int amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                account.deposit(amount);
                return;
            }        
        }
        System.out.println("해당 계좌를 찾을 수 없습니다.");
    }

    public void withdrawFromAccount(String accountNumber, int amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                account.withdraw(amount);
                return;
            }        
        }
        System.out.println("해당 계좌를 찾을 수 없습니다.");
    }

    public void displayAllaccounts() {
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
        }
    }

    public int getTotalAccounts() {
        return BankAccount.getTotalAccounts();
    }
}
