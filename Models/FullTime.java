package Models;

import Abstracts.Employee;

public class FullTime extends Employee {
    private double salary;
    private double bonus;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcEarnings() {
        return this.getSalary() + this.getBonus();
    }
}
