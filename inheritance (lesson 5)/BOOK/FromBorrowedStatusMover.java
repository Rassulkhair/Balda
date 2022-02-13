package BOOK;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String borrowed = Status.BORROWED.getStat();
        book.setStatus(borrowed);
        switch (requestedStatus) {
            case OVERDUED -> {
                book.setStatus(Status.OVERDUED.getStat());
                System.out.printf("Переход из статуса %s, в статус %s осуществлен", borrowed, Status.OVERDUED.getStat());
                System.out.println();
            }
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE.getStat());
                System.out.printf("Переход из статуса %s, в статус %s осуществлен", borrowed, Status.AVAILABLE.getStat());
                System.out.println();
            }
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED.getStat());
                System.out.printf("Переход из статуса %s, в статус %s осуществлен", borrowed, Status.ARCHIVED.getStat());
                System.out.println();
            }
            default -> System.out.println("ERROR");


        }
    }
}
