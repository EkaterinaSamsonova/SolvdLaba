package library.items;

public class NonFictionBook extends Book {

    final static String genre = "NonFiction";

    public NonFictionBook(String title, String author, boolean availability) {
        super(title, author, genre, availability);
    }
}
