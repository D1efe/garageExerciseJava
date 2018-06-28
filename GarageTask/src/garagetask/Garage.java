package garagetask;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

    public static void main(String[] args) {

        Car a, b;
        MotorCycle c, d;
        Truck e, f;

        ArrayList<Vehicle> vehicleCollections = new ArrayList<>();

        vehicleCollections.add(a = new Car("C0001", "Nissan GT", "Medium", "Large", true));
        vehicleCollections.add(b = new Car("C0002", "Mercedes Benz", "Large", "Small", true));
        vehicleCollections.add(c = new MotorCycle("M0001", "Suzuki Katana", "Large", false, "Silver"));
        vehicleCollections.add(d = new MotorCycle("M0002", "Ducati Monster", "Large", false, "Red"));
        vehicleCollections.add(e = new Truck("T0001", "Albion Viking 24", "Medium", "Large", 2));
        vehicleCollections.add(f = new Truck("T0002", "Peugeot Boxer", "Medium", "Medium", 4));

        addVehicle(vehicleCollections);

        for (int x = 0; x < vehicleCollections.size(); x++) {

            double basePrice = 15;
            double bill;

            if (vehicleCollections.get(x) instanceof Car) {
                bill = basePrice * 2;
                System.out.println("The bill for this " + vehicleCollections.getClass() + " is: " + bill);
            } else if (vehicleCollections.get(x) instanceof MotorCycle) {
                bill = basePrice * 3;
                System.out.println("The bill for this " + vehicleCollections.getClass() + " is: " + bill);
            } else if (vehicleCollections.get(x) instanceof Truck) {
                bill = basePrice * 4;
                System.out.println("The bill for this " + vehicleCollections.getClass() + " is: " + bill);
            }

        }
    }

    public static void addVehicle(ArrayList<Vehicle> y) {

        Scanner user = new Scanner(System.in);
        String d1 = "yes";
        String d2 = "no";

        ArrayList<Vehicle> newVehicle = new ArrayList<>();

        System.out.println("Add new vehicle? type 'yes' or 'no'");

        String a = user.next();

        while (!a.matches("yes") && !a.matches("no")) {
            System.err.println("Please type either 'yes' or 'no'");
            a = user.next();
        }

        if (a.equals("yes")) {
            newVehicle.add(new Car());
            newVehicle.add(new MotorCycle());
            newVehicle.add(new Truck());
            y.addAll(newVehicle);
            System.out.println("vehicles have been added \n");

        } else if (a.matches("no")) {

        }
    }

    public void removeVehicle() {

    }

    public void fixVehicle() {

    }

    public void emptyGarage() {

    }
}
