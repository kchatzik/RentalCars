import java.util.HashMap;

/**
 * Created by krksk on 28/03/2017.
 */
public class VehicleSpecifications {
    HashMap<String,String> carTypeMap;
    HashMap<String,String> doorsCarTypeMap;
    HashMap<String,String> transmissionMap;
    HashMap<String,String> fuelAirConMap;

    public VehicleSpecifications(){
        carTypeMap = new HashMap<String,String>();
        doorsCarTypeMap = new HashMap<String,String>();
        transmissionMap = new HashMap<String,String>();
        fuelAirConMap = new HashMap<String,String>();

        carTypeMap.put("M","Mini");
        carTypeMap.put("E","Economy");
        carTypeMap.put("C","Compact");
        carTypeMap.put("I","Intermediate");
        carTypeMap.put("S","Standard");
        carTypeMap.put("F","Full Size");
        carTypeMap.put("P","Premium");
        carTypeMap.put("L","Luxury");
        carTypeMap.put("X","Special");

        doorsCarTypeMap.put("B","2 doors");
        doorsCarTypeMap.put("C","4 doors");
        doorsCarTypeMap.put("D","5 doors");
        doorsCarTypeMap.put("W","Estate");
        doorsCarTypeMap.put("T","Convertible");
        doorsCarTypeMap.put("F","SUV");
        doorsCarTypeMap.put("P","Pickup");
        doorsCarTypeMap.put("V","PassengerVan");

        transmissionMap.put("M","Manual");
        transmissionMap.put("A","Automatic");

        fuelAirConMap.put("N","Petrol/no AC");
        fuelAirConMap.put("R","Petrol/AC");
    }

    public String getCarTypeByLetter(char letter){
        String letterString = Character.toString(letter);
        return carTypeMap.get(letterString);
    }

    public String getDoorsCarTypeByLetter(char letter){
        String letterString = Character.toString(letter);
        return doorsCarTypeMap.get(letterString);
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
