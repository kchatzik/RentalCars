import java.util.ArrayList;

/**
 * Created by krksk on 26/03/2017.
 */
public class VehiclePrinter {

    public static void printNamePrice(ArrayList<Vehicle> vehicleArrayList){
        for(Vehicle vehicle : vehicleArrayList){
            System.out.println(vehicle.getName()+" - "+vehicle.getPrice());
        }
        System.out.println("\n");
    }
}
