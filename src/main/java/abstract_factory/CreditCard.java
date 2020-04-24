package abstract_factory;

public abstract class CreditCard {
    private String cardNumber;
    private String ccvNumber;

    public String getCardNumber(){
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getccvNumber(){
        return this.ccvNumber;
    }

    public void setccvNumber(String ccvNumber){
        this.ccvNumber = ccvNumber;
    }

}