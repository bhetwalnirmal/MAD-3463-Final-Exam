package Models;

import Abstracts.Vehicle;

public class FixedBasedPartTime extends PartTime {
    private double fixedAmount;

    public FixedBasedPartTime(String name, int age, Vehicle vehicle, double rate, double hoursWorked, double fixedAmount) {
        super(name, age, vehicle, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

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

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is Part Time / Fixed Amt");
        System.out.println("\t - Rate:" + this.getRate());
        System.out.println("\t - Hours Worked:" + this.getHoursWorked());
        System.out.println("\t - Fixed Amt:" + this.fixedAmount);
        System.out.println("\t - Earnings:" + this.calcEarnings());
    }
}
