import payment.*;

public class Main {
    public static void main(String[] args) {
        // ایجاد مشتری
        Customer regularCustomer = new RegularCustomer("Ali");
        Customer premiumCustomer = new PremiumCustomer("Tina");
        Customer anotherRegularCustomer = new RegularCustomer("Mani");

        //  روش‌های پرداخت
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-5432", "Ali's Card");
        PaymentStrategy paypalPayment = new PayPalPayment("Tina@gmail.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AljljG5SL7DivfNa");

        //اطلاعات هر مشتری
        regularCustomer.displayCustomerInfo();
        premiumCustomer.displayCustomerInfo();
        anotherRegularCustomer.displayCustomerInfo();

        // دو تا پرداخت مشتری ها
        regularCustomer.makePayment(creditCardPayment, 150.50);
        regularCustomer.makePayment(paypalPayment, 200.75);

        premiumCustomer.makePayment(creditCardPayment, 300.00);
        premiumCustomer.makePayment(bitcoinPayment, 0.5);

        anotherRegularCustomer.makePayment(paypalPayment, 120.25);
        anotherRegularCustomer.makePayment(bitcoinPayment, 0.3);

        //  تاریخچه پرداخت‌ها
        System.out.println("\nPayment History for Regular Customer (Ali):");
        regularCustomer.showPaymentHistory();

        System.out.println("\nPayment History for Premium Customer (Tina):");
        premiumCustomer.showPaymentHistory();

        System.out.println("\nPayment History for Regular Customer (Mani):");
        anotherRegularCustomer.showPaymentHistory();
    }
}
