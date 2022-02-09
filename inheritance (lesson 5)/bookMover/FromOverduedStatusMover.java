package bookMover;

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


            }


        }

    }

