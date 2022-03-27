package Models;

import Abstracts.Vehicle;

public class Car extends Vehicle {
    private String model;
    private int modelYear;

    public Car(String make, String plate, String model, int modelYear) {
        super(make, plate);
        this.model = model;
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public void printMyData() {
        System.out.println("Employee Has a Car");
        System.out.println("\t - Make:" + this.getMake());
        System.out.println("\t - Plate:" + this.getPlate());
        System.out.println("\t - Model:" + this.getModel());
        System.out.println("\t - Model Year:" + this.getModelYear());
    }
}
