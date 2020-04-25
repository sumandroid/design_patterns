package structural.decorators;

public class DriverClass {

    public static void main(String []args){
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwitch()));
        sandwich.setBread("HoneyOat");
        sandwich.setMeat("turkey");
        sandwich.setDressing("Mint");
        System.out.println(sandwich.toString());
    }
}
