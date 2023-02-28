package cars;

import components.Component;
import components.Engine;
import components.Tyre;
import components.Windscreen;

import java.util.ArrayList;

public abstract class Car {

    private double value;
    private String make;
    private Size size;
    private String colour;

    // private HashMap<IFix, Integer> carParts;
    private ArrayList<Component> carParts;

    public Car (double value, String make, Size size, String colour, Engine engine, Windscreen windscreen, Tyre tyre) {
        this.value = value;
        this.make = make;
        this.size = size;
        this.colour = colour;
        // this.carParts = new HashMap<>();
        // this.carParts.put(windscreenDamage);
        this.carParts = new ArrayList<>();
        this.carParts.add(engine);
        this.carParts.add(windscreen);
        this.carParts.add(tyre);
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

    public ArrayList<Component> getCarParts() {
        return this.carParts;
    }

//    public void fix() {
//        this.ma
//    }

}
