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
public class Car extends Vehicle {

    String bootSize;
    Boolean convertible;

    public Car(String id, String name, String engineSize, String bootSize, Boolean convertible) {

        this.id = id;
        this.name = name;
        this.engineSize = engineSize;
        this.bootSize = bootSize;
        this.convertible = convertible;

    }

    public Car() {
    }
    

}
