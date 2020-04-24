package abstract_factory;

public class DriverClass {

    public static void main(String []args){
        CreditCardFactory cardFactory = CreditCardFactory.getCardFactory(651);
        CreditCard creditCard = cardFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard);

        cardFactory = CreditCardFactory.getCardFactory(500);
        creditCard = cardFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(creditCard);
    }
}
