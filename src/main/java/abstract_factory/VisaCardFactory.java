package abstract_factory;

public class VisaCardFactory extends CreditCardFactory {

    @Override
    CreditCard getCreditCard(CardType cardType) {
        return new VisaCreditCard();
    }
}
