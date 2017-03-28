import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by krksk on 26/03/2017.
 */
public class VehicleJsonReader {

    public static ArrayList<Vehicle> readCarsFromURLToArrayList(String jsonSource) throws Exception{
        URL url = new URL(jsonSource);

        // read from the URL
        Scanner scan = new Scanner(url.openStream());
        String readString = new String();
        while (scan.hasNext())
            readString += scan.nextLine();
        scan.close();


        JSONObject jsonObject = new JSONObject(readString);

        JSONObject  searchObject = jsonObject.getJSONObject("Search");
        JSONArray vehicleListObject = searchObject.getJSONArray("VehicleList");

        ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>();

        for(int i=0; i<vehicleListObject.length(); i++){

            JSONObject vehicleProperties = vehicleListObject.getJSONObject(i);

            String sipp = vehicleProperties.getString("sipp");
            String name = vehicleProperties.getString("name");
            Double price = vehicleProperties.getDouble("price");
            String supplier = vehicleProperties.getString("supplier");
            Double rating = vehicleProperties.getDouble("rating");

            Vehicle newVehicle = new Vehicle(sipp, name, price, supplier, rating);

            vehicleArrayList.add(newVehicle);

        }

        return vehicleArrayList;
    }
}
