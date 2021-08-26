package com.greatlearning.designpattern2;

public class Main2 {
    public static void main(String[] args) {
        BankAccount bankAccount1 = BankAccount.builder()
                .accountNo(1)
                .type(AccountType.SAVINGS)
                .branch("BLR")
                .balance(100)
                .build();

        BankAccount bankAccount2 = BankAccount.builder()
                .accountNo(2)
                .type(AccountType.CURRENT)
                .branch("DEL")
                .balance(10)
                .atmTransactions("what-ever")
                .schedule(2)
                .build();

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
    }
}
