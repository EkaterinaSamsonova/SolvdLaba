package library.items;

public class FictionBook extends Book {
    public FictionBook(String title, String author, boolean availability) {
        super(title, author, "Fiction", availability);
    }
}
