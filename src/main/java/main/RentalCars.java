package main;

import java.util.ArrayList;

/**
 * Created by Kyriakos Chatzikyriakou on 26/03/2017.
 */
public class RentalCars{
    public static void main(String[] args) throws Exception{

        System.out.println(createTextToPrint());

    }
    public static String createTextToPrint() throws Exception{
        String toBeReturned = "";

        String jsonSourceUrl = "http://www.rentalcars.com/js/vehicles.json";
        VehicleSpecifications specs = new VehicleSpecifications();
        ArrayList<Vehicle> vehicleArrayList = VehicleJsonReader.readVehiclesFromURLToArrayList(jsonSourceUrl);


        toBeReturned+=VehiclePrinter.printNamePrice(vehicleArrayList)+"\n";

        toBeReturned+=
                VehiclePrinter.printNameSippTypeDoorsTransmissionFuelAirCon(vehicleArrayList, specs)+"\n";

        ArrayList<Vehicle> highestRatedVehicles =
                VehicleHandler.getHighestRatedSupplierPerType(vehicleArrayList, specs);
        toBeReturned+=VehiclePrinter.printHighestRatedSupplier(highestRatedVehicles, specs)+"\n";

        toBeReturned+=VehiclePrinter.printScores(vehicleArrayList, specs)+"\n";

        return toBeReturned;
    }
}
