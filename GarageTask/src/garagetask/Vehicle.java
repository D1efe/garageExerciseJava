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
public abstract class Vehicle {

    String id;    
    String name;
    String engineSize;

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", engineSize=" + engineSize + '}';
    }
   
}

