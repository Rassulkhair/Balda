package TAX;

public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double incomeTaxType = amount * 0.13;

        return incomeTaxType;
    }

}
