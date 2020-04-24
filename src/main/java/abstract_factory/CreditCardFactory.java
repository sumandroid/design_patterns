package abstract_factory;

//abstract factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCardFactory(int creditScore){
        if(creditScore > 650){
            return new AmexCardFactory();
        }else{
            return new VisaCardFactory();
        }
    }

    abstract CreditCard getCreditCard(CardType cardType);
}
