package library.users;

import java.util.Objects;

public final class LibrarianAssistant extends User{

    private int employeeNumber;

    public LibrarianAssistant(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LibrarianAssistant that = (LibrarianAssistant) o;
        return employeeNumber == that.employeeNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeNumber);
    }

    @Override
    public String toString() {
        return "LibrarianAssistant{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
