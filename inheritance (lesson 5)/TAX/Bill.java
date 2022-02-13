package TAX;

public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService){
        this.amount=amount;
        this.taxType=taxType;
        this.taxService=taxService;
    }

    public void payTaxes(){
        //TODO

        double taxAmount=1.1;

        taxService.payOut(taxAmount);
    }


}
