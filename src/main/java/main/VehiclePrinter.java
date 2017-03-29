package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Kyriakos Chatzikyriakou on 26/03/2017.
 */
public class VehiclePrinter {

    public static String printNamePrice(ArrayList<Vehicle> vehicleArrayList){
        String toBeReturned = "";
        ArrayList<Vehicle> localVehicleArrayList = (ArrayList<Vehicle>) vehicleArrayList.clone();
        localVehicleArrayList.sort(Comparator.comparingDouble(Vehicle::getPrice));
        int counter = 0;

        for(Vehicle vehicle : localVehicleArrayList){
            toBeReturned+=(++counter)+". "
                    +vehicle.getName()+" - "
                    +vehicle.getPrice()+"\n";
        }

        toBeReturned+="\n"+"\n";

        return toBeReturned;

    }

    public static String printNameSippTypeDoorsTransmissionFuelAirCon(ArrayList<Vehicle> vehicleArrayList, VehicleSpecifications specs){
        String toBeReturned = "";

        int counter = 0;

        for(Vehicle vehicle : vehicleArrayList){

            char[] sippArray = vehicle.getSipp().toCharArray();
            String vehicleType = specs.getVehicleTypeByLetter(sippArray[0]);
            String doorsvehicleType = specs.getDoorsVehicleTypeByLetter(sippArray[1]);
            String transmission = specs.getTransmissionByLetter(sippArray[2]);
            String fuelAirCon = specs.getFuelAirConByLetter(sippArray[3]);

            String fuel = fuelAirCon.split("/")[0];
            String airCon = fuelAirCon.split("/")[1];

            toBeReturned+=(++counter)+". "
                    +vehicle.getName()+" - "
                    +vehicle.getSipp()+" - "
                    +vehicleType+" - "
                    +doorsvehicleType+" - "
                    +transmission+" - "
                    +fuel+" - "
                    +airCon+"\n";

        }

        toBeReturned+="\n"+"\n";

        return toBeReturned;

    }

    public static String printHighestRatedSupplier(ArrayList<Vehicle> highestRatedVehicles, VehicleSpecifications specs){
        String toBeReturned = "";

        ArrayList<Vehicle> localHighestRatedVehicles = (ArrayList<Vehicle>) highestRatedVehicles.clone();
        localHighestRatedVehicles.sort(Comparator.comparingDouble(Vehicle::getRating).reversed());
        int counter = 0;

        for(Vehicle vehicle : highestRatedVehicles){
            char[] sippArray = vehicle.getSipp().toCharArray();
            String vehicleType = specs.getVehicleTypeByLetter(sippArray[0]);

            toBeReturned+=(++counter)+". "
                    +vehicle.getName()+" - "
                    +vehicleType+" - "
                    +vehicle.getSupplier()+" - "
                    +vehicle.getRating()+"\n";
        }

        toBeReturned+="\n"+"\n";

        return toBeReturned;

    }

    public static String printScores(ArrayList<Vehicle> vehicleArrayList, VehicleSpecifications specs){
        String toBeReturned = "";

        int counter = 0;
        ArrayList<ArrayList> sortedBySumOfScoresArrayList = new ArrayList<>();

        for(Vehicle vehicle : vehicleArrayList){

            int vehicleScore = VehicleHandler.getScoreBySIPP(vehicle.getSipp(), specs);
            double vehicleCombinedScore = vehicleScore + vehicle.getRating();

            ArrayList<Object> vehicleWithSumOfScores = new ArrayList<Object>();
            vehicleWithSumOfScores.add(vehicle.getName());
            vehicleWithSumOfScores.add(vehicleScore);
            vehicleWithSumOfScores.add(vehicle.getRating());
            vehicleWithSumOfScores.add(vehicleCombinedScore);

            sortedBySumOfScoresArrayList.add(vehicleWithSumOfScores);

        }

        Collections.sort(sortedBySumOfScoresArrayList, new Comparator<ArrayList>() {
            @Override
            public int compare(ArrayList o1, ArrayList o2) {
                double o1SumOfScore = (double) o1.get(3);
                double o2SumOfScore = (double) o2.get(3);

                if(o1SumOfScore>o2SumOfScore) return -1;
                else if(o1SumOfScore<o2SumOfScore) return 1;
                else return 0;
            }
        });

        for(ArrayList<Object> vehicleWithSumOfScore : sortedBySumOfScoresArrayList){

            toBeReturned+=(++counter)+". "
                    +vehicleWithSumOfScore.get(0)+" - "
                    +vehicleWithSumOfScore.get(1)+" - "
                    +vehicleWithSumOfScore.get(2)+" - "
                    +vehicleWithSumOfScore.get(3)+"\n";
        }

        toBeReturned+="\n"+"\n";

        return toBeReturned;

    }
}
