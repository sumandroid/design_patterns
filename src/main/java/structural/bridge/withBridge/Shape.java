package structural.bridge.withBridge;

public abstract class Shape {
    private Color color;

    public Shape(Color color){
        this.color = color;
    }

    void applyColor(){
     color.applyColor();
    }
}
