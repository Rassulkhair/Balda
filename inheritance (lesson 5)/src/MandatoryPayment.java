public class MandatoryPayment extends Bill {
    public MandatoryPayment(double amount, TaxType taxtype, TaxService taxService) {
        super(amount, taxtype,taxService);
    }
    @Override
    public void payTaxes() {
        super.payTaxes();
    }
}
