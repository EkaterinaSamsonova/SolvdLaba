package library;

import library.items.Book;
import library.items.DigitalMedia;
import library.items.Item;
import library.items.Magazine;

public class Main {
    public static void main(String[] args){
        LibraryCatalog catalog = new LibraryCatalog();

        Book book1 = new Book("New book1", "Kate", "drama", true);
        DigitalMedia disc1 = new DigitalMedia("New disc1", "Kate", "pop", true);
        Magazine magazine1 = new Magazine("New magazine1", "Kate", "psychology", true);

        catalog.addItem(book1);
        catalog.addItem(disc1);
        catalog.addItem(magazine1);

        book1.reserve();
        disc1.download();
        magazine1.subscribed();

        System.out.println(book1);
        System.out.println(disc1);
        System.out.println(magazine1);

    }
}
