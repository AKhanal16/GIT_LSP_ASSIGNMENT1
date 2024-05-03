package org.howard.edu.lsp.oopfinal.question2;

public class PaypalPayment implements PaymentStrategy {
    private String emailAddress;

    public PaypalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account " + emailAddress);
    }
}