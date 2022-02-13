package bookMover;

class FromAvailableBookMover extends BookMover {
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
        }
    }
}
