package structural.composite;

public class DriverClass {

    public static void main(String []args){
        Menu mainMenu = new Menu("main", "/main");
        MenuItem safetyMenuItem = new MenuItem("safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaim");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());

    }
}
