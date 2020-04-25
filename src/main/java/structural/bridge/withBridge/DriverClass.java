package structural.bridge.withBridge;

public class DriverClass {

    public static void main(String []args){
        Color blue = new Blue();
        Circle circle = new Circle(blue);
        circle.applyColor();
    }
}
