package creational.abstract_factory;

public class AmexCardFactory extends CreditCardFactory {

    @Override
    CreditCard getCreditCard(CardType cardType) {
        return new AmexCreditCard();
    }
}
