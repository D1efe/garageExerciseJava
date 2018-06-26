/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagetask;

/**
 *
 * @author dan
 */
public class Truck extends Vehicle {

    int payLoad;
    int doors;

    public Truck() {

        this.name = name;
        this.id = id;
        this.engine = engine;
        this.payLoad = payLoad;
        this.doors = doors;

    }

    public Truck(String name, String id, Boolean engine, int payLoad, int doors) {

        this.name = name;
        this.id = id;
        this.engine = engine;
        this.payLoad = payLoad;
        this.doors = doors;

    }

}
