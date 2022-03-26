package Models;

public class FixedBasedPartTime extends PartTime {
    private double fixedAmount;

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double calcEarnings() {
        return (this.getRate() * this.getHoursWorked()) + this.getFixedAmount();
    }
}
