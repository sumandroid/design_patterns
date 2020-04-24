package factory;

import java.util.ArrayList;
import java.util.List;

public class BlogWebSite implements Website {
    List<Page> pages = new ArrayList<>();

    @Override
    public void createWebSite() {
        pages.add(new HomePage());
        pages.add(new ContactPage());
    }

    @Override
    public List<Page> getWebSitePages() {
        return pages;
    }
}
