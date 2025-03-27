package com.main;
import com.bank.*;

public class Main {
    public static void main(String[] args) {
        // HanaBank 인스턴스를 가져옵니다.
        HanaBank bank = HanaBank.getInstance();
        
        // 이자율 설정
        HanaBank.getInstance().setInterestRate(2.5f);
        System.out.println("설정된 이자율: " + BankAccount.getInterestRate() + "%");

        // 계좌 생성
        BankAccount account1 = new BankAccount("홍길동", "예금");
        BankAccount account2 = new BankAccount("김철수", "예금");
        BankAccount account3 = new BankAccount("박영희", "적금");

        // 계좌 추가
        bank.newAccount(account1);
        bank.newAccount(account2);
        bank.newAccount(account3);

        // 모든 계좌 정보 출력 
        System.out.println("\n모든 계좌 정보:");
        bank.displayAllaccounts();
        
        // 특정 계좌 조회
        System.out.println("\n홍길동 계좌 조회:");
        bank.findAccountByNumber(account1.getAccountNumber());
        
        // 입금
        System.out.println("\n홍길동 계좌에 5000원 입금:");
        bank.depositToAccount(account1.getAccountNumber(), 5000);
        
        // 출금
        System.out.println("\n홍길동 계좌에서 2000원 출금:");
        bank.withdrawFromAccount(account1.getAccountNumber(), 2000);
        
        // 계좌 정보 출력
        System.out.println("\n홍길동 계좌 정보:");
        bank.findAccountByNumber(account1.getAccountNumber());
        
        // 총 계좌 수 출력
        System.out.println("\n현재 총 계좌 수: " + bank.getTotalAccounts());        
    }
}
