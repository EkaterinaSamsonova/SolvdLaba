package library.enums;

public enum MemberType {
    CHILD(5, 0),
    ADULT(10, 5),
    SENIOR(15, 2),
    STUDENT(8, 0);

    private final int borrowingLimit;
    private final int lateFeePerDay; // in dollars

    MemberType(int borrowingLimit, int lateFeePerDay) {
        this.borrowingLimit = borrowingLimit;
        this.lateFeePerDay = lateFeePerDay;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public int getLateFee(int daysLate) {
        return daysLate * lateFeePerDay;
    }
}