package Abstracts;
import Interfaces.IPrintable;

public abstract class Vehicle implements IPrintable {
    private int make;
    private String plate;

    @Override
    public void printMyData() {

    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}