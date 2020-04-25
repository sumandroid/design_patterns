package structural.decorators;

public abstract class SandWitchDecorator implements Sandwich{
    protected Sandwich customSandwitch;

    public SandWitchDecorator(Sandwich customSandwitch){
        this.customSandwitch = customSandwitch;
    }

    public void setDressing(String dressing){
        customSandwitch.setDressing(dressing);
    }

    public void setBread(String bread){
        customSandwitch.setBread(bread);
    }

    public void setMeat(String meat){
        customSandwitch.setMeat(meat);
    }

    public String toString(){
        return customSandwitch.toString();
    }
}
