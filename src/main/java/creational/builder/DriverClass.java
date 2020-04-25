package creational.builder;

public class DriverClass {

    public static void main(String []args){
        LunchOrder lunchOrder = new LunchOrder.Builder().bread("HoneyRoasted").condiments("Pepper & salt")
                .dressing("Mayo").meat("Chicken").build();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lunch is: \n")
                .append("bread: ").append(lunchOrder.getBread()).append("\n")
                .append("condiments: ").append(lunchOrder.getCondiments()).append("\n")
                .append("dressing: ").append(lunchOrder.getDressing()).append("\n")
                .append("meat: ").append(lunchOrder.getMeat()).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
