package payment;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHoldName;

    public CreditCardPayment(String cardNumber, String cardHoldName){
    this.cardHoldName = cardHoldName;
    this.cardNumber = cardNumber;
    }

    @Override
    public void pay (double amount){
        System.out.println("The amount of " + amount + " was paid by Credit card");
        System.out.println("Payment deatails : " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails(){
    return "Pay by Credit Card and the card number is : " + cardNumber + "\n" + "Card hold name is : " + cardHoldName;
    }
}


