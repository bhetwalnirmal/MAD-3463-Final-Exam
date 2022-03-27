package Abstracts;

import Interfaces.IPrintable;

public class Employee implements IPrintable {
    private String name;
    private int age;
    private Vehicle vehicle;

    public Employee(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calcBirthYear () {
        return 2022 - this.getAge();
    }

    public double calcEarnings () {
        return 1000.00;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void printMyData() {
        System.out.print("Name:");
        System.out.println(this.getName());
        System.out.print("Year of Birth:");
        System.out.println(this.calcBirthYear());
    }
}
