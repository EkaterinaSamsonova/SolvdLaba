package library.items;

import java.util.Objects;

public class DigitalMedia extends Item implements RenewableItem, ReservableItem {

    private String format;
    private double fileSize;

    public DigitalMedia(String title, String author, String genre, boolean availability) {
        super(title, author, genre, availability);
    }

    public final void download(){
        System.out.println("Downloaded successfully:" + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DigitalMedia that = (DigitalMedia) o;
        return Double.compare(fileSize, that.fileSize) == 0 && Objects.equals(format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), format, fileSize);
    }

    @Override
    public String toString() {
        return "DigitalMedia{" +
                "format='" + format + '\'' +
                ", fileSize=" + fileSize +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", availability=" + availability +
                '}';
    }

    @Override
    public void renew() {

    }

    @Override
    public void reserve() {

    }

    @Override
    public void cancelReservation() {

    }
}
