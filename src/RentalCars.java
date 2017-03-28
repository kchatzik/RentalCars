import java.util.ArrayList;

/**
 * Created by krksk on 26/03/2017.
 */
public class RentalCars{
    public static void main(String[] args) throws Exception{

        String jsonSourceUrl = "http://www.rentalcars.com/js/vehicles.json";
        ArrayList<Vehicle> vehicleArrayList = VehicleJsonReader.readCarsFromURLToArrayList(jsonSourceUrl);
        VehiclePrinter.printNamePrice(vehicleArrayList);


    }
}
