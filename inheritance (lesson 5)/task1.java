```jsx
public enum Status {
    BORROWED("Borrowed"),
    AVAILABLE("Available"),
    OVERDUED("Overdued"),
    ARCHIVED("Archived");

    private String stat;
    Status(String stat){
        this.stat=stat;
    }

    public String getStat(){
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}




public class Book {
    private String title;
    private String status;

    public Book(String title) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ", статус книги: " + status;
    }


}



public abstract class BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");
    }

}




class FromArchivedBookMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String archived=Status.ARCHIVED.getStat();
        book.setStatus(archived);
        switch (requestedStatus){
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", archived, Status.AVAILABLE.getStat() );
            }
            case BORROWED -> System.out.printf("Переход из %s в статус %s невозможен ", archived, Status.BORROWED.getStat());
            case OVERDUED-> System.out.printf("Переход из %s в статус %s невозможен ", archived, Status.OVERDUED.getStat());
            default -> System.out.println("ERROR");

        }


        }

    }

    
    
    
    
    
    
class FromAvailableBookMover extends  BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String available=Status.AVAILABLE.getStat();

        switch (requestedStatus){
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", available, Status.ARCHIVED.getStat() );
            }
            case BORROWED -> {
                book.setStatus(Status.BORROWED.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", available, Status.BORROWED.getStat() );
            }
            case OVERDUED-> System.out.printf("Переход из %s в статус %s невозможен ", available, Status.OVERDUED.getStat());
            default -> System.out.println("ERROR");

        }


    }
}




public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String overdued = Status.OVERDUED.getStat();
        book.setStatus(overdued);
        switch (requestedStatus) {
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", overdued, Status.ARCHIVED.getStat() );
            }
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", overdued, Status.AVAILABLE.getStat() );
            }
            case BORROWED -> System.out.printf("Переход из %s в статус %s невозможен ", overdued, Status.BORROWED.getStat());
            default -> System.out.println("ERROR");

        }


    }

}






public class FromBorrowedStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String borrowed = Status.BORROWED.getStat();
        book.setStatus(borrowed);
        switch (requestedStatus) {
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", borrowed, Status.ARCHIVED.getStat() );
            }
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", borrowed, Status.AVAILABLE.getStat() );
            }
            case OVERDUED -> {
                book.setStatus(Status.OVERDUED.getStat());
                System.out.printf("Переход из %s в статус %s осуществлен ", borrowed, Status.OVERDUED.getStat() );
            }
            default -> System.out.println("ERROR");

        }


    }

}



public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings" );
        BookMover fromAvailableStatusMover = new FromAvailableBookMover();
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
       


    }
}
