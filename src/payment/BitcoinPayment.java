package payment;

public class BitcoinPayment implements PaymentStrategy{
    private String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount){
        System.out.println("The amount of " + amount + " was paid in Bitcoin");
        System.out.println("Payment deatails : " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails(){
        return "Pay by Bitcoin and the wallet adrress is : " + walletAddress ;
    }

}
