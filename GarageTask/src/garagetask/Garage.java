/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagetask;

import java.util.ArrayList;

/**
 *
 * @author dan
 */
public class Garage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car a = new Car();
        Car b = new Car();
        MotorCycle c = new MotorCycle();
        MotorCycle d = new MotorCycle();
        Truck e = new Truck();
        Truck f = new Truck();

        ArrayList<Vehicle> carCollections = new ArrayList<>();

        carCollections.add(e);

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
