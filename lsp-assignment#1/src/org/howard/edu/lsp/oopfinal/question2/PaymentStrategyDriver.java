package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart newcart = new ShoppingCart();

        // Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        newcart.setPaymentStrategy(creditCardPayment);
        newcart.checkout(100.0);

        // PayPal Payment
        PaymentStrategy payPalPayment = new PaypalPayment("user@example.com");
        newcart.setPaymentStrategy(payPalPayment);
        newcart.checkout(50.0);

        // Bitcoin Payment
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
        newcart.setPaymentStrategy(bitcoinPayment);
        newcart.checkout(75.0);
    }
}
