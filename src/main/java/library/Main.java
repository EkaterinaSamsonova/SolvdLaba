package library;

import library.exceptions.BookIsReservedException;
import library.items.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args){
        Logger logger = LogManager.getLogger(Main.class);

        LibraryCatalog catalog = new LibraryCatalog();
        Item fictionBook = new FictionBook("Fairy Tale", "Stephen King", true);
        BorrowableItem nonFictionBook = new NonFictionBook("An American Plague", "Jim Murphy", true);
        Book novel = new NovelBook("Wuthering Heights", "Emily Brontë", false);

        DigitalMedia disc1 = new DigitalMedia("New disc1", "Kate", "pop", true);
        Magazine magazine1 = new Magazine("New magazine1", "Kate", "psychology", true);

        //catalog.addItem(null);
        catalog.addItem(fictionBook);
        catalog.addItem((Item) nonFictionBook);
        catalog.addItem(novel);
        catalog.addItem(disc1);
        catalog.addItem(magazine1);

        try {
            novel.reserve();
        } catch (BookIsReservedException e) {
            logger.error("User is unable to reserve a book!");
        } finally {
            logger.info("Book got to the finally block");
        }
        disc1.download();
        magazine1.subscribed();

        System.out.println(fictionBook);
        System.out.println(nonFictionBook);
        System.out.println(novel);
        System.out.println(disc1);
        System.out.println(magazine1);
        LibraryCatalog.previewItemInfo(fictionBook);
    }
}
