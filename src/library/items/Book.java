package library.items;

import java.util.Date;
import java.util.Objects;

public class Book extends Item implements BorrowableItem, RenewableItem, ReservableItem{

    private int isbn;
    private int pageCount;

    public Book(String title, String author, String genre, boolean availability) {
        super(title, author, genre, availability);
    }

    public void reserve(){
        this.availability = false;
        System.out.println("Reserved successfully:" + this);
    }

    @Override
    public void cancelReservation() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return isbn == book.isbn && pageCount == book.pageCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbn, pageCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", pageCount=" + pageCount +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", availability=" + availability +
                '}';
    }

    @Override
    public void borrow() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public Date calculateDueDate() {
        return null;
    }

    @Override
    public void renew() {

    }
}
