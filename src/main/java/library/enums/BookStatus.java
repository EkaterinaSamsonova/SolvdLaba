package library.enums;

public enum BookStatus {
    AVAILABLE,
    CHECKED_OUT,
    ON_HOLD,
    LOST;

    public String getStatusMessage() {
        switch (this) {
            case AVAILABLE:
                return "The book is available for borrowing.";
            case CHECKED_OUT:
                return "The book is currently checked out.";
            case ON_HOLD:
                return "The book is on hold for a member.";
            case LOST:
                return "The book has been reported as lost.";
            default:
                return "Unknown status.";
        }
    }
}