package garagetask;

import java.util.ArrayList;

public class Garage {

    public static void main(String[] args) {

        Car a, b;
        MotorCycle c, d;
        Truck e, f;

        ArrayList<Vehicle> vehicleCollections = new ArrayList<>();

        vehicleCollections.add(a = new Car("C0001", "Toyota", "Medium", "Large", true));
        vehicleCollections.add(b = new Car("C0002", "Mercedes", "Large", "Small", true));
        vehicleCollections.add(c = new MotorCycle());
        vehicleCollections.add(d = new MotorCycle());
        vehicleCollections.add(e = new Truck());
        vehicleCollections.add(f = new Truck());

    }

    public void addVehicle() {

    }

    public void removeVehicle() {

    }

    public void fixVehicle() {

    }

    public void emptyGarage() {

    }
}
