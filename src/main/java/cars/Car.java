package cars;

import carParts.CarPart;
import carParts.Engine;
import carParts.Battery;
import carParts.FuelTank;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Car {

    private double value;
    private String make;
    private Size size;
    private String colour;

    private HashMap<String, CarPart> carParts;

    public Car (double value, String make, Size size, String colour, Engine engine) {
        this.value = value;
        this.make = make;
        this.size = size;
        this.colour = colour;

        this.carParts = new HashMap<>();
        this.carParts.put("engine", engine);
    }

    public double getValue() {
        return this.value;
    }

    public String getMake() {
        return this.make;
    }

    public Size getSize() {
        return this.size;
    }

    public String getColour() {
        return this.colour;
    }

    public HashMap<String, CarPart> getCarParts() {
        return this.carParts;
    }

    public void addCarPart(String description, CarPart newPart) {
        this.carParts.put(description, newPart);
    }

    public CarPart getCarPartByType(String type) {
        return this.carParts.get(type);
    }


}
