package garagetask;

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

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", engineSize=" + engineSize + "bootSize=" + bootSize + "convertible=" + convertible + '}';
    }

    public String getBootSize() {
        return bootSize;
    }

    public void setBootSize(String bootSize) {
        this.bootSize = bootSize;
    }

    public Boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

}
