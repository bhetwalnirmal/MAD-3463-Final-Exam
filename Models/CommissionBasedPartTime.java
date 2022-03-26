package Models;

import Abstracts.Employee;

public class CommissionBasedPartTime extends PartTime {
    private double commission;

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calcEarnings() {
        return (this.getRate() * this.getHoursWorked()) + this.getCommission();
    }
}
