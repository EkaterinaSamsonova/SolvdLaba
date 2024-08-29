package library;

import library.exceptions.BookNotFoundException;
import library.items.Item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

    public void addItem(Item item) {
        if(item == null){
           throw new BookNotFoundException("Book not found:" + item);
        }

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
        try (FileReader fr = new FileReader("src/authors.txt");
             BufferedReader br = new BufferedReader(fr)) {
            br.readLine();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    @Override
    public void searchByGenre(String genre) {

    }
}
