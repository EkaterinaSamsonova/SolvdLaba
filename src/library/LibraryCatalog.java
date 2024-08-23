package library;

import library.items.Item;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog implements Catalog {

    static{
       System.out.println("Library Catalog is creating");
    }

    public LibraryCatalog() {
        System.out.println("Library Catalog is created");
    }

    List<Item> libraryItems = new ArrayList<>();

    public void addItem(Item item){
        libraryItems.add(item);
        System.out. println("Added new item:" + item.toString());
    }

    public static void previewItemInfo(Item item){
        System.out. println("Catalog item info:" + item.toString());
    }

    @Override
    public void searchByTitle(String title) {

    }

    @Override
    public void searchByAuthor(String author) {

    }

    @Override
    public void searchByGenre(String genre) {

    }
}
