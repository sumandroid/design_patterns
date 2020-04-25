package creational.prototype;

public class DriverClass {
    public static void main(String []args){
        ItemRegistry itemRegistry = new ItemRegistry();

        Book book = (Book)itemRegistry.createItem("Book");
        book.setTitle("Star Wars");
        book.setPrice(5000);
        System.out.println(book);
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        System.out.println(book.getPrice());

        Book newBook = (Book)itemRegistry.createItem("Book");
        newBook.setTitle("HarryPotter");
        newBook.setPrice(6000);
        System.out.println(newBook);
        System.out.println(newBook.getTitle());
        System.out.println(newBook.getDescription());
        System.out.println(newBook.getPrice());

    }
}
