package factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingWebSite implements Website {
    private List<Page> pages = new ArrayList<>();

    @Override
    public void createWebSite() {
        pages.add(new HomePage());
        pages.add(new CartPage());

    }

    @Override
    public List<Page> getWebSitePages() {
        return pages;
    }
}
