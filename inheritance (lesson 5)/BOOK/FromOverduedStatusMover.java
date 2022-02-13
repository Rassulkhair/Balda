package BOOK;

public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String overdued = Status.OVERDUED.getStat();
        book.setStatus(overdued);
        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE.getStat());
                System.out.printf("Переход из статуса %s, в статус %s осуществлен", overdued, Status.AVAILABLE.getStat());
                System.out.println();
            }
            case BORROWED -> {
                System.out.printf("Переход из статуса %s, в статус %s невозможен", overdued, Status.BORROWED.getStat());
                System.out.println();
            }
            case ARCHIVED -> {
                System.out.printf("Переход из статуса %s, в статус %s невозможен", overdued, Status.ARCHIVED.getStat());
                System.out.println();
            }
            default -> System.out.println("Error");
        }
    }
}
