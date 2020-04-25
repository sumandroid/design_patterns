package structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name, String url){
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this));
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            stringBuilder.append(iterator.next().toString());
        }
        return stringBuilder.toString();
    }
}
