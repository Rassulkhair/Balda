public class CashPayment extends Bill{
    public CashPayment(double amount, TaxType taxtype, TaxService taxService) {
        super(amount, taxtype, taxService);
    }

    @Override
    public void payTaxes(){
        super.payTaxes();
    }
}
