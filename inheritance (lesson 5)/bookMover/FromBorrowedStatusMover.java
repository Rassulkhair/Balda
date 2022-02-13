package bookMover;

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
