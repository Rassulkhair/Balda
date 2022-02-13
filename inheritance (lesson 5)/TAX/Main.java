package TAX;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new SalaryPayment(3.3, new IncomeTaxType(), new TaxService()),
                new HousingPayment(8.9, new ProgressiveTaxType(), new TaxService())
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
