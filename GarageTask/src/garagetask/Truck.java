package garagetask;

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

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", engineSize=" + engineSize + "payLoad=" + payLoad + "doors=" + doors + '}';
    }

    public String getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}
