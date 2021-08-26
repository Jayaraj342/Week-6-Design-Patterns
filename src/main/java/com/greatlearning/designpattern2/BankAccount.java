package com.greatlearning.designpattern2;

import lombok.Data;

@Data
public class BankAccount {
    private long accountNo;
    private AccountType type;
    private String branch;
    private double balance;

    private String atmTransactions;
    private int schedule;

    public BankAccount(long accountNo, AccountType type, String branch, double balance, String atmTransactions, int schedule) {
        this.accountNo = accountNo;
        this.type = type;
        this.branch = branch;
        this.balance = balance;
        this.atmTransactions = atmTransactions;
        this.schedule = schedule;
    }

    public static CustomBuilder builder() {
        return new CustomBuilder();
    }

    public static class CustomBuilder {
        private long accountNo;
        private AccountType type;
        private String branch;
        private double balance;

        private String atmTransactions;
        private int schedule;

        public CustomBuilder accountNo(long accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        public CustomBuilder type(AccountType type) {
            this.type = type;
            return this;
        }

        public CustomBuilder branch(String branch) {
            this.branch = branch;
            return this;
        }

        public CustomBuilder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public CustomBuilder atmTransactions(String atmTransactions) {
            this.atmTransactions = atmTransactions;
            return this;
        }

        public CustomBuilder schedule(int schedule) {
            this.schedule = schedule;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(
                    accountNo,
                    type,
                    branch,
                    balance,
                    atmTransactions,
                    schedule
            );
        }
    }
}
