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
public class MotorCycle extends Vehicle {

    Boolean sideCarAttachment;
    String colour;

    public MotorCycle(String id, String name, String engineSize, Boolean sideCarAttachment, String colour) {

        this.id = id;
        this.name = name;
        this.engineSize = engineSize;
        this.sideCarAttachment = sideCarAttachment;
        this.colour = colour;

    }

}
