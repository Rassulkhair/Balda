package BOOK;

public enum Status {
    AVAILABLE("Available"),
    BORROWED("Borrowed"),
    OVERDUED("Overdued"),
    ARCHIVED("Archived");

    private String stat;

    Status(String stat) {
        this.stat = stat;
    }

    public String getStat() {
        return stat;
    }
}
