package TAX;

public class SalaryPayment extends Bill{

    public SalaryPayment(double amount, TaxType taxType, TaxService taxService) {
        super(amount, taxType, taxService);
    }

    @Override
    public void payTaxes(){
        super.payTaxes();
    }
}
