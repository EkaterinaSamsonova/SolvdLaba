package library.exceptions;

public class UnableToDownloadException extends RuntimeException {
    public UnableToDownloadException(String message) {
        super(message);
    }
}
