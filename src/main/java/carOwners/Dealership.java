package carOwners;

import cars.Car;
import cars.Hybrid;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> carStock;

    public Dealership(double till, ArrayList<Car> carStock) {
        this.till = till;
        this.carStock = carStock;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<Car> getCarStock() {
        return this.carStock;
    }

    public void buyCar(Car car) {
        this.carStock.add(car);
        this.till -= car.getValue();
    }

    public void sellCar(Car car, Customer customer) {
        this.carStock.remove(car);
        this.till += car.getValue();
        customer.buyCar(car);
    }
}
