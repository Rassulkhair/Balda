package BOOK;

public class FromArchivedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String archived = Status.ARCHIVED.getStat();
        book.setStatus(archived);
        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE.getStat());
                System.out.printf("Переход из статуса %s, в статус %s выполнен", archived, Status.AVAILABLE.getStat());
                System.out.println();
            }
            case BORROWED -> {
                System.out.printf("Переход из статуса %s, в статус %s невозможен", archived, Status.BORROWED.getStat());
                System.out.println();
            }
            case OVERDUED -> {
                System.out.printf("Переход из статуса %s, в статус %s невозможен", archived, Status.OVERDUED.getStat());
                System.out.println();
            }
            default -> System.out.println("Error");
        }
    }
}
