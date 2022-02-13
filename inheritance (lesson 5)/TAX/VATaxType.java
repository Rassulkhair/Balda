package TAX;

public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double vaTaxType = amount * 0.18;
        return vaTaxType;
    }
}
