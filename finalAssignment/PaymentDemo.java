abstract class PaymentMethod {
    abstract boolean validate();
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String cvv;

    public CreditCard(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    boolean validate() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public void pay(double amount) {
        if (validate()) {
            System.out.println("Paid $" + amount + " using Credit Card.");
        } else {
            System.out.println("Invalid Credit Card details.");
        }
    }
}

class PayPal extends PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    boolean validate() {
        return email.contains("@") && password.length() >= 6;
    }

    @Override
    public void pay(double amount) {
        if (validate()) {
            System.out.println("Paid $" + amount + " using PayPal.");
        } else {
            System.out.println("Invalid PayPal credentials.");
        }
    }
}

class BankTransfer extends PaymentMethod {
    private String accountNumber;

    public BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    boolean validate() {
        return accountNumber.length() == 10;
    }

    @Override
    public void pay(double amount) {
        if (validate()) {
            System.out.println("Paid $" + amount + " via Bank Transfer.");
        } else {
            System.out.println("Invalid Bank Account number.");
        }
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCard("1234567812345678", "123");
        PaymentMethod payment2 = new PayPal("user@example.com", "securepass");
        PaymentMethod payment3 = new BankTransfer("1234567890");

        payment1.pay(150.0);
        payment2.pay(75.5);
        payment3.pay(300.0);
    }
}
