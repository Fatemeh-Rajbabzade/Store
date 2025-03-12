package payment;
import java.util.ArrayList;

public abstract class Customer {
    private String name;
    private ArrayList<String> paymentHistory;

    //مقدار دهی تاریخچه
    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    //  پرداخت توسط مشتری
    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add("Amount: " + amount + "\n" + paymentStrategy.getPaymentDetails());
    }

    // متد برای نمایش تاریخچه پرداخت‌های مشتری
    public void showPaymentHistory() {
        System.out.println("Payment History for " + name + ":");
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
    }

    // متد برای دریافت نام مشتری
    public String getName() {
        return name;
    }

    // متد برای دریافت تاریخچه پرداخت‌ها
    public ArrayList<String> getPaymentHistory() {
        return paymentHistory;
    }
}
