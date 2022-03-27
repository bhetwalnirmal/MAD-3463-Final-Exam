package Models;

import Abstracts.Employee;
import Abstracts.Vehicle;

public class Intern extends Employee {
    private String schoolName;

    public Intern(String name, int age, Vehicle vehicle, String schoolName) {
        super(name, age, vehicle);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public double calcEarnings() {
        return 1000;
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is Intern");
        System.out.println("\t - School Name:" + this.getSchoolName());
        System.out.println("\t - Earnings:" + this.calcEarnings());
    }
}
