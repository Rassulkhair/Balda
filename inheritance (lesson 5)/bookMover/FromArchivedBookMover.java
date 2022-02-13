package bookMover;

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
        }
    }
}
