package structural.bridge.withoutBridge;

public class RedCircle extends Circle {
    @Override
    void applyColor() {
        System.out.println("applying red color to circle");
    }
}
