package bookMover;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings" );
        BookMover fromAvailableStatusMover = new FromAvailableBookMover();
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);



    }
}
