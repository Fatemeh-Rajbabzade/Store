package payment;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount){
        System.out.println("The amount of " + amount + " was paid in paypal");
        System.out.println("Payment details : " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails(){
        return "Pay by PayPal and the email adrress is : " + email ;

    }
}
