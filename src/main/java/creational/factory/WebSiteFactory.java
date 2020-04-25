package creational.factory;

public class WebSiteFactory {

    public Website getWebSite(WebSiteType type) throws IllegalArgumentException {
        Website website;
        switch (type){
            case SHOP:
                website = new ShoppingWebSite();
                return website;
            case BLOG:
                website = new BlogWebSite();
                return website;
            default:
                throw new IllegalArgumentException("Not supported type");
        }
    }
}
