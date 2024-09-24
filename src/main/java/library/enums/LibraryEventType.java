package library.enums;

public enum LibraryEventType {
    BOOK_ADDED("A new book has been added to the library."),
    BOOK_REMOVED("A book has been removed from the library."),
    MEMBER_REGISTERED("A new member has registered."),
    MEMBER_UPDATED("A member's details have been updated."),
    BOOK_CHECKED_OUT("A book has been checked out by a member."),
    BOOK_RETURNED("A book has been returned by a member.");

    private final String description;

    LibraryEventType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getEventMessage() {
        return "Event: " + name() + " - " + description;
    }
}