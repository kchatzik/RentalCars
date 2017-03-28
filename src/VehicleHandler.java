import java.util.ArrayList;

/**
 * Created by krksk on 28/03/2017.
 */
public class VehicleHandler {
    public static ArrayList<Vehicle> getVehiclesByType(ArrayList<Vehicle> vehicleArrayList, char type, VehicleSpecifications specs){

        ArrayList<Vehicle> vehiclesWithTheType = new ArrayList<Vehicle>();

        for(Vehicle vehicle : vehicleArrayList) {

            char[] sippArray = vehicle.getSipp().toCharArray();
            String carTypeString = specs.getCarTypeByLetter(sippArray[0]);
            char carTypeChar = carTypeString.charAt(0);

            if (carTypeChar == type) vehiclesWithTheType.add(vehicle);

        }

        return vehiclesWithTheType;

    }

    public static ArrayList<Character> getVehicleTypes(ArrayList<Vehicle> vehicleArrayList, VehicleSpecifications specs){

        ArrayList<Character> vehicleTypesArrayList = new ArrayList<Character>();

        for(Vehicle vehicle : vehicleArrayList){

            char[] sippArray = vehicle.getSipp().toCharArray();
            String carTypeString = specs.getCarTypeByLetter(sippArray[0]);
            char carTypeChar = carTypeString.charAt(0);

            if(!vehicleTypesArrayList.contains(Character.valueOf(carTypeChar))){

                vehicleTypesArrayList.add(Character.valueOf(carTypeChar));

            }
        }

        return vehicleTypesArrayList;

    }

    public static ArrayList<Vehicle> getHighestRatedSupplierPerType(ArrayList<Vehicle> vehicleArrayList, VehicleSpecifications specs){

        ArrayList<Vehicle> highestRatingVehicles = new ArrayList<Vehicle>();
        ArrayList<Character> vehicleTypes = getVehicleTypes(vehicleArrayList, specs);

        for(Character character : vehicleTypes){

            ArrayList<Vehicle> vehiclesOfType = getVehiclesByType(vehicleArrayList, character.charValue(), specs);
            double highestRating = 0;
            Vehicle highestRatingVehicle = null;

            for(Vehicle vehicle : vehiclesOfType){

                if(vehicle.getRating() > highestRating){

                    highestRating = vehicle.getRating();
                    highestRatingVehicle = vehicle;

                }
            }

            highestRatingVehicles.add(highestRatingVehicle);

        }

        return highestRatingVehicles;
    }

    public static int getScoreBySIPP(String sipp, VehicleSpecifications specs){
        int score = 0;
        char[] sippArray = sipp.toCharArray();
        char vehicleTypeChar = sippArray[2];
        char vehicleFuelAirConChar = sippArray[3];

        if(vehicleTypeChar == 'M') score += 1;
        else if(vehicleTypeChar == 'A') score += 5;

        if(vehicleFuelAirConChar == 'R') score += 2;

        return score;

    }
}
