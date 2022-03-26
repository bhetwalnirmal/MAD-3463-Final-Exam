package Abstracts;

import Interfaces.IPrintable;

public class Employee implements IPrintable {
    private String name;
    private int age;

    @Override
    public void printMyData() {

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
}
