package structural.bridge.withoutBridge;

public class DriverClass {

    public static void main(String []args){
        Circle redCircle = new RedCircle();
        redCircle.applyColor();

        Square greenSquare = new GreenSquare();
        greenSquare.applyColor();
    }
}
