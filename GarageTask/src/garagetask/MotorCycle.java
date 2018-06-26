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

    public MotorCycle() {

        this.name = name;
        this.id = id;
        this.engine = engine;
        this.sideCarAttachment = sideCarAttachment;
        this.colour = colour;

    }

    public MotorCycle(String name, String id, Boolean engine, Boolean sideCarAttachment, String colour) {

        this.name = name;
        this.id = id;
        this.engine = engine;
        this.sideCarAttachment = sideCarAttachment;
        this.colour = colour;

    }

}