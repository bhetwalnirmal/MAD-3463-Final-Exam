package Models;

import Abstracts.Vehicle;

public class CommissionBasedPartTime extends PartTime {
    private double commission;

    public CommissionBasedPartTime(String name, int age, Vehicle vehicle, double rate, double hoursWorked, double commission) {
        super(name, age, vehicle, rate, hoursWorked);
        this.commission = commission;
    }

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

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is Part Time / Commissioned");
        System.out.println("\t - Rate:" + this.getRate());
        System.out.println("\t - Hours Worked:" + this.getHoursWorked());
        System.out.println("\t - Commission:" + this.getCommission());
        System.out.println("\t - Earnings:" + this.calcEarnings());
    }
}
