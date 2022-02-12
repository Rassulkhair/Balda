public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;


    public Bill(double amount, TaxType taxType, TaxService taxService){
        this.amount=amount;
        this.taxService=taxService;
        this.taxType=taxType;
    }



    public void payTaxes(){
        //TODO
        double taxAmount=0.0;

        taxService.payOut(taxAmount);
    }

}
