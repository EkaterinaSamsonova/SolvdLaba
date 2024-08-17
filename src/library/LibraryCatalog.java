package library;

import library.items.Item;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    List<Item> libraryItems = new ArrayList<>();

    public void addItem(Item item){
        libraryItems.add(item);
        System.out. println("Added new item:" + item.toString());
    }
}
