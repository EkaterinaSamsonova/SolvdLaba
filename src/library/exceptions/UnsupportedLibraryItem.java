package library.exceptions;

public class UnsupportedLibraryItem  extends RuntimeException {
    public UnsupportedLibraryItem(String message) {
        super(message);
    }
}
