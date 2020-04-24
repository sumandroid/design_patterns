package factory;

public abstract class Page {
    private String title;
    private String metaTitle;
    private String metaDescription;

    public Page(String title, String metaTitle, String metaDescription){
        this.metaDescription = metaDescription;
        this.title = title;
        this.metaTitle = metaTitle;
    }

    public Page(){}
}
