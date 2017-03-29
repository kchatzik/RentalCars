package controllers;
import main.RentalCars;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Kyriakos Chatzikyriakou on 29/03/2017.
 */
@Path("/cars")
public class RestAPI {
    @Path("/all")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getAll(){
        String toReturnString;
        try {
            toReturnString = RentalCars.createTextToPrint();
            toReturnString = toReturnString.replace("\n","<br>");
        } catch (Exception e) {
            toReturnString = "Resource not found";
        }

        return toReturnString;
    }

}
