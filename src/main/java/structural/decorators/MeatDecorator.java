package structural.decorators;

public class MeatDecorator extends SandWitchDecorator {

     public MeatDecorator(Sandwich customSandwitch) {
        super(customSandwitch);
    }

    @Override
    public void setMeat(String meat) {
        customSandwitch.setMeat(meat);
    }
}
