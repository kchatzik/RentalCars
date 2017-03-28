import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by krksk on 26/03/2017.
 */
public class VehiclePrinter {

    public static void printNamePrice(ArrayList<Vehicle> vehicleArrayList){

        ArrayList<Vehicle> localVehicleArrayList = (ArrayList<Vehicle>) vehicleArrayList.clone();
        localVehicleArrayList.sort(Comparator.comparingDouble(Vehicle::getPrice));
        int counter = 0;

        for(Vehicle vehicle : localVehicleArrayList){
            System.out.println((++counter)+". "
                    +vehicle.getName()+" - "
                    +vehicle.getPrice());
        }

        System.out.println("\n");

    }

    public static void printNameSippTypeDoorsTransmissionFuelAirCon(ArrayList<Vehicle> vehicleArrayList, VehicleSpecifications specs){

        int counter = 0;

        for(Vehicle vehicle : vehicleArrayList){

            char[] sippArray = vehicle.getSipp().toCharArray();
            String carType = specs.getCarTypeByLetter(sippArray[0]);
            String doorsCarType = specs.getDoorsCarTypeByLetter(sippArray[1]);
            String transmission = specs.getTransmissionByLetter(sippArray[2]);
            String fuelAirCon = specs.getFuelAirConByLetter(sippArray[3]);

            String fuel = fuelAirCon.split("/")[0];
            String airCon = fuelAirCon.split("/")[1];

            System.out.println((++counter)+". "
                    +vehicle.getName()+" - "
                    +vehicle.getSipp()+" - "
                    +carType+" - "
                    +doorsCarType+" - "
                    +transmission+" - "
                    +fuel+" - "
                    +airCon);

        }

        System.out.println("\n");

    }

    public static void printHighestRatedSupplier(ArrayList<Vehicle> highestRatedVehicles, VehicleSpecifications specs){

        ArrayList<Vehicle> localHighestRatedVehicles = (ArrayList<Vehicle>) highestRatedVehicles.clone();
        localHighestRatedVehicles.sort(Comparator.comparingDouble(Vehicle::getRating).reversed());
        int counter = 0;

        for(Vehicle vehicle : highestRatedVehicles){
            char[] sippArray = vehicle.getSipp().toCharArray();
            String carType = specs.getCarTypeByLetter(sippArray[0]);

            System.out.println((++counter)+". "
                    +vehicle.getName()+" - "
                    +carType+" - "
                    +vehicle.getSupplier()+" - "
                    +vehicle.getRating());
        }

        System.out.println("\n");
    }

    public static void printScores(ArrayList<Vehicle> vehicleArrayList, VehicleSpecifications specs){

        int counter = 0;

        for(Vehicle vehicle : vehicleArrayList){

            int vehicleScore = VehicleHandler.getScoreBySIPP(vehicle.getSipp(), specs);
            double vehicleCombinedScore = vehicleScore + vehicle.getRating();

            System.out.println((++counter)+". "
                    +vehicle.getName()+" - "
                    +vehicleScore+" - "
                    +vehicle.getRating()+ " - "
                    +vehicleCombinedScore);

        }

        System.out.println("\n");
    }
}
