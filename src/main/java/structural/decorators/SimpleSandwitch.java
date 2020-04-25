package structural.decorators;

public class SimpleSandwitch implements Sandwich {

    private String bread;
    private String meat;
    private String dressing;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    @Override
    public String toString(){
        return bread + " + " + meat + " + " + dressing;
    }
}
