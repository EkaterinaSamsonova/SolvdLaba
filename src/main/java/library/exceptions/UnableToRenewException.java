package library.exceptions;

public class UnableToRenewException extends RuntimeException {
    public UnableToRenewException(String message) {
        super(message);
    }
}
