import java.util.ArrayList;

/**
 * Created by krksk on 26/03/2017.
 */
public class RentalCars{
    public static void main(String[] args) throws Exception{

        String jsonSourceUrl = "http://www.rentalcars.com/js/vehicles.json";
        VehicleSpecifications specs = new VehicleSpecifications();
        ArrayList<Vehicle> vehicleArrayList = VehicleJsonReader.readCarsFromURLToArrayList(jsonSourceUrl);

        VehiclePrinter.printNamePrice(vehicleArrayList);

        VehiclePrinter.printNameSippTypeDoorsTransmissionFuelAirCon(vehicleArrayList, specs);

        ArrayList<Vehicle> highestRatedVehicles = VehicleHandler.getHighestRatedSupplierPerType(vehicleArrayList, specs);
        VehiclePrinter.printHighestRatedSupplier(highestRatedVehicles, specs);

        VehiclePrinter.printScores(vehicleArrayList, specs);

    }
}
