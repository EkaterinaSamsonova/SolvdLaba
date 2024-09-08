package library;

import library.collections.CustomLinkedList;
import library.exceptions.BookNotFoundException;
import library.exceptions.UnsupportedLibraryItem;
import library.items.Book;
import library.items.DigitalMedia;
import library.items.Item;
import library.items.Magazine;
import library.users.User;

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

    List<Book> books = new ArrayList<>();
    List<DigitalMedia> digitals = new ArrayList<>();
    List<Magazine> magazines = new ArrayList<>();
    CustomLinkedList<User> users = new CustomLinkedList<>();

    public void addItem(Item item) {
        switch (item) {
            case null -> throw new BookNotFoundException("Book not found:" + item);
            case Book book -> books.add(book);
            case DigitalMedia media -> digitals.add(media);
            case Magazine magazine -> magazines.add(magazine);
            default -> throw new UnsupportedLibraryItem("Library item of type [" + item.getClass() + "] is not supported.");
        }

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
