package BOOK;

public class FromAvailableStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String available = Status.AVAILABLE.getStat();
        book.setStatus(available);
        switch (requestedStatus) {
            case BORROWED -> {
                book.setStatus(Status.BORROWED.getStat());
                System.out.printf("Переход из статуса %s, в статус %s осуществлен", available, Status.BORROWED.getStat());
                System.out.println();
            }
            case ARCHIVED -> {
                book.setStatus((Status.ARCHIVED.getStat()));
                System.out.printf("Переход из статуса %s, в статус %s осуществлен", available, Status.ARCHIVED.getStat());
                System.out.println();
            }
            case OVERDUED -> {
                System.out.printf("Переход из статуса %s, в статус %s невозможен", available, Status.ARCHIVED.getStat());
                System.out.println();
            }
            default -> System.out.println("error");
        }
    }
}
