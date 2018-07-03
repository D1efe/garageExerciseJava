package garagetask;

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

    public MotorCycle() {

    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", engineSize=" + engineSize + "sideCarAttachment=" + sideCarAttachment + "colour=" + colour + '}';
    }

    public Boolean getSideCarAttachment() {
        return sideCarAttachment;
    }

    public void setSideCarAttachment(Boolean sideCarAttachment) {
        this.sideCarAttachment = sideCarAttachment;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
