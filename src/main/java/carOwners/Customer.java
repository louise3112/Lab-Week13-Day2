package carOwners;

import cars.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Car> carCollection;

    public Customer(String name, double money, ArrayList<Car> carCollection) {
        this.name = name;
        this.money = money;
        this.carCollection = carCollection;
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public ArrayList<Car> getCarCollection() {
        return this.carCollection;
    }

    public void buyCar(Car car) {
        this.carCollection.add(car);
        this.money -= car.getValue();
    }
}
