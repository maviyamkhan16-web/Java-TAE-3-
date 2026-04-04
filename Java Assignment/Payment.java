abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by UPI: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by NetBanking: " + amount);
    }
}
