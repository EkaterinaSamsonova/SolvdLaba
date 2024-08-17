package library.items;

import java.util.Objects;

public class Item {
    protected String title;
    protected String author;
    protected String genre;
    protected boolean availability;

    public Item(String title, String author, String genre, boolean availability) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    public String getInfo(){
        return title + " " + author + " " + genre + " " + availability;
    }

    public boolean checkAvailability(){
        return availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return availability == item.availability && Objects.equals(title, item.title) && Objects.equals(author, item.author) && Objects.equals(genre, item.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, availability);
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", availability=" + availability +
                '}';
    }
}
