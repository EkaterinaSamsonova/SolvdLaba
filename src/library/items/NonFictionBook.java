package library.items;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, boolean availability) {
        super(title, author, "NonFiction", availability);
    }
}
