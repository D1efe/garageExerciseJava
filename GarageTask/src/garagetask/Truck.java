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

    String payLoad;
    int doors;

    public Truck(String id, String name, String engineSize, String payLoad, int doors) {

        this.id = id;
        this.name = name;
        this.engineSize = engineSize;
        this.payLoad = payLoad;
        this.doors = doors;

    } 
    
    public Truck() {
        
    }
    

    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", engineSize=" + engineSize + "payLoad=" + payLoad + "doors=" + doors + '}';
    }

}
