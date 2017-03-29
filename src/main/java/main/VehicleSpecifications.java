package main;

import java.util.HashMap;

/**
 * Created by Kyriakos Chatzikyriakou on 28/03/2017.
 */
public class VehicleSpecifications {
    HashMap<String,String> vehicleTypeMap;
    HashMap<String,String> doorsVehicleTypeMap;
    HashMap<String,String> transmissionMap;
    HashMap<String,String> fuelAirConMap;

    public VehicleSpecifications(){
        vehicleTypeMap = new HashMap<String,String>();
        doorsVehicleTypeMap = new HashMap<String,String>();
        transmissionMap = new HashMap<String,String>();
        fuelAirConMap = new HashMap<String,String>();

        vehicleTypeMap.put("M","Mini");
        vehicleTypeMap.put("E","Economy");
        vehicleTypeMap.put("C","Compact");
        vehicleTypeMap.put("I","Intermediate");
        vehicleTypeMap.put("S","Standard");
        vehicleTypeMap.put("F","Full Size");
        vehicleTypeMap.put("P","Premium");
        vehicleTypeMap.put("L","Luxury");
        vehicleTypeMap.put("X","Special");

        doorsVehicleTypeMap.put("B","2 doors");
        doorsVehicleTypeMap.put("C","4 doors");
        doorsVehicleTypeMap.put("D","5 doors");
        doorsVehicleTypeMap.put("W","Estate");
        doorsVehicleTypeMap.put("T","Convertible");
        doorsVehicleTypeMap.put("F","SUV");
        doorsVehicleTypeMap.put("P","Pickup");
        doorsVehicleTypeMap.put("V","PassengerVan");

        transmissionMap.put("M","Manual");
        transmissionMap.put("A","Automatic");

        fuelAirConMap.put("N","Petrol/no AC");
        fuelAirConMap.put("R","Petrol/AC");
    }

    public String getVehicleTypeByLetter(char letter){
        String letterString = Character.toString(letter);
        return vehicleTypeMap.get(letterString);
    }

    public String getDoorsVehicleTypeByLetter(char letter){
        String letterString = Character.toString(letter);
        return doorsVehicleTypeMap.get(letterString);
    }

    public String getTransmissionByLetter(char letter){
        String letterString = Character.toString(letter);
        return transmissionMap.get(letterString);
    }

    public String getFuelAirConByLetter(char letter){
        String letterString = Character.toString(letter);
        return fuelAirConMap.get(letterString);
    }



}
