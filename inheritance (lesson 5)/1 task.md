```jsx
public enum Status {
    BORROWED,
    AVAILABLE,
    OVERDUED,
    ARCHIVED;
    
    }




public class Book {
    private String title;
    private Status status;

    public Book(String title, Status status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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




public class FromArchivedBookMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.ARCHIVED) {
            if (requestedStatus == Status.AVAILABLE) {
                book.setStatus(requestedStatus);
                System.out.printf("Запрос %s обработан", requestedStatus);
            } else if (book.getStatus() == Status.ARCHIVED) {
                System.out.printf("Запрос %s обработан", book.getStatus());
            }
        }

    }
    
    
    
    
    
    
    public class FromAvailableBookMover extends  BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus()==Status.AVAILABLE){
            if(requestedStatus==Status.ARCHIVED|| requestedStatus==Status.BORROWED){
                book.setStatus(requestedStatus);
                System.out.printf("Запрос %s обработан", requestedStatus);
            }
            else if (book.getStatus() == Status.AVAILABLE) {
                System.out.printf("Запрос %s, обаботан", book.getStatus());
            }
        }
    }
}
}
