package structural.bridge.withoutBridge;

public class GreenSquare extends Square {

    @Override
    void applyColor() {
        System.out.println("applying green color to square");
    }
}
