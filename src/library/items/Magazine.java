package library.items;

import java.util.Objects;

public class Magazine extends Item implements SubscribableItem{

    private int issuedNumber;
    public Magazine(String title, String author, String genre, boolean availability) {
        super(title, author, genre, availability);
    }

    public void subscribed(){
        System.out.println("Subscribed successfully:" + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return issuedNumber == magazine.issuedNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), issuedNumber);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issuedNumber=" + issuedNumber +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", availability=" + availability +
                '}';
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
