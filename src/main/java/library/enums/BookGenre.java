package library.enums;

public enum BookGenre {
    FICTION("Fictional narratives that tell made-up stories."),
    NON_FICTION("Factual books that provide information."),
    MYSTERY("Stories involving suspense and solving a crime."),
    FANTASY("Fiction that includes magical elements and other worlds."),
    BIOGRAPHY("Life stories of real people.");

    private final String description;

    BookGenre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getBrief() {
        return "Genre: " + name() + " - " + description;
    }
}
