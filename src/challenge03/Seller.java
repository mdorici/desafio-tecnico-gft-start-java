package challenge03;

public class Seller extends Employee {
    private double commission;
    private long salesNumber;

    public Seller(String name, long cpf, double commission, long salesNumber) {
        super(name, cpf);
        this.commission = commission;
        this.salesNumber = salesNumber;
    }

    @Override
    public double salary() {
        return super.minimumWage + (this.commission * this.salesNumber);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public long getSalesNumber() {
        return salesNumber;
    }

    public void setSalesNumber(long salesNumber) {
        this.salesNumber = salesNumber;
    }
}
