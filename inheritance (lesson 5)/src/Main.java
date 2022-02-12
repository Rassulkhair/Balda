public class Main {
    public static void main(String[] args) {
        TaxService taxService=new TaxService();
        Bill[] payments=new Bill[]{

                new CashPayment(12, new ProgressiveTaxType(), new TaxService()),
                new MandatoryPayment(13, new IncomeTaxType(), new TaxService())
        };

        for (int i=0; i< payments.length; ++i){
            Bill bill =payments[i];
            bill.payTaxes();
        }
    }
}
