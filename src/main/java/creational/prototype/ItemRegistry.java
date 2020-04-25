package creational.prototype;

import java.util.HashMap;

public class ItemRegistry {

    private HashMap<String, Item> registry = new HashMap<>();

    public ItemRegistry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item) registry.get(type).clone(); //creates a shallow copy of main object. All other behaviours are shared b/w copied instances
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        return item;
    }




    private void loadItems(){
        Book book = new Book();
        book.setTitle("Alice in wonderland");
        book.setDescription("adventures of alice in wonderland");
        book.setPrice(1000);
        book.setNumberOfPages(2000);
        registry.put("Book", book);
    }
}
