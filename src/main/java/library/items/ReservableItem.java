package library.items;

import library.exceptions.BookIsReservedException;

public interface ReservableItem {

    void reserve () throws BookIsReservedException;
    void cancelReservation();
}
