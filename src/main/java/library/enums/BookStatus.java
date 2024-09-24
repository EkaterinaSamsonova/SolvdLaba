package library.enums;

public enum BookStatus {
    AVAILABLE("The book is available for borrowing."),
    CHECKED_OUT("The book is currently checked out."),
    ON_HOLD("The book is on hold for a member."),
    LOST("The book has been reported as lost.");

    private String bookStatus;

    BookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
}