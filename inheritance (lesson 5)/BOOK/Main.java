package BOOK;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);

        Book book1=new Book("The Great Getsbi");
        BookMover fromArchivedStatusMover= new FromArchivedStatusMover();
        fromArchivedStatusMover.moveToStatus(book1, Status.OVERDUED);
    }
}