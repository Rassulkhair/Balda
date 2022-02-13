package TAX;

public class HousingPayment extends Bill {

    public HousingPayment(double amount, TaxType taxType, TaxService taxService) {
        super(amount, taxType, taxService);
    }

    @Override
    public void payTaxes() {
        super.payTaxes();
    }
}
