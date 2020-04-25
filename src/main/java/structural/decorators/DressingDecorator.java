package structural.decorators;

public class DressingDecorator extends SandWitchDecorator {
    public DressingDecorator(Sandwich customSandwitch) {
        super(customSandwitch);
    }

    @Override
    public void setDressing(String dressing) {
        customSandwitch.setDressing(dressing);
    }
}
