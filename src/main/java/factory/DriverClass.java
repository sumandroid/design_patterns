package factory;

public class DriverClass {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        try {
            Website website = webSiteFactory.getWebSite(WebSiteType.BLOG);
            website.createWebSite();
            for (Page pages : website.getWebSitePages()) {
                System.out.println(pages);
            }
            website = webSiteFactory.getWebSite(WebSiteType.SHOP);
            website.createWebSite();
            for (Page pages : website.getWebSitePages()) {
                System.out.println(pages);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
