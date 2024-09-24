package library.enums;

public enum LibrarySection {
    FICTION("Fictional works and novels.", 5000),
    NON_FICTION("Informative and factual books.", 3000),
    REFERENCE("Dictionaries, encyclopedias, and guides.", 1000),
    CHILDREN("Books suitable for children.", 2000),
    SCIENCE("Books on various scientific topics.", 1500);

    private final String description;
    private final int averageBooks; // Average number of books in this section

    LibrarySection(String description, int averageBooks) {
        this.description = description;
        this.averageBooks = averageBooks;
    }

    public String getDescription() {
        return description;
    }

    public int getAverageBooks() {
        return averageBooks;
    }

    public String getSectionInfo() {
        return "Section: " + name() +
                " - " + description +
                " (Approx. " + averageBooks + " books)";
    }
}
