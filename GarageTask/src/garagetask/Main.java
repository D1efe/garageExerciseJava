package garagetask;

public class Main {

    public static void main(String[] args) {

        Garage g1 = new Garage();

        g1.addVehicle(g1.createVehicle("c", "Ford"));
        g1.addVehicle(g1.createVehicle("t", "Ford"));
        g1.addVehicle(g1.createVehicle("t", "Mercedes"));
        g1.printGarage(g1.vehicleCollections);

        g1.removeVehicle(g1.vehicleCollections, "Ford");
        System.out.println("");
        g1.printGarage(g1.vehicleCollections);
        
        g1.addVehicle(g1.createVehicle("c", "Maybach"));
        g1.addVehicle(g1.createVehicle("c", "Maybach"));
        g1.addVehicle(g1.createVehicle("c", "Maybach"));
        g1.emptyGarage(g1.vehicleCollections);
        g1.printGarage(g1.vehicleCollections);
       

    }

}
