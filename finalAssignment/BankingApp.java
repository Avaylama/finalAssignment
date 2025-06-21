class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.02; 
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; 
    }
}

class FixedDepositAccount extends Account {
    private int termInYears;

    public FixedDepositAccount(double balance, int termInYears) {
        super(balance);
        this.termInYears = termInYears;
    }

    @Override
    double calculateInterest() {
        return balance * 0.06 * termInYears; 
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account acc = new Account(10000);
        SavingsAccount savAcc = new SavingsAccount(10000);
        FixedDepositAccount fdAcc = new FixedDepositAccount(10000, 3);

        System.out.println("Account Interest: $" + acc.calculateInterest());
        System.out.println("Savings Account Interest: $" + savAcc.calculateInterest());
        System.out.println("Fixed Deposit Interest: $" + fdAcc.calculateInterest());
    }
}
