package library.items;

import java.util.Date;

public interface BorrowableItem {
    void borrow();
    void returnItem();
    Date calculateDueDate();
}
