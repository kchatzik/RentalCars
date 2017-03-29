package main;

/**
 * Created by Kyriakos Chatzikyriakou on 26/03/2017.
 */
public class Vehicle {

    private String sipp;
    private String name;
    private double price;
    private String supplier;
    private double rating;

    public Vehicle(String sipp, String name, double price, String supplier, double rating) {

        this.sipp = sipp;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.rating = rating;
    }

    public String getSipp() {
        return sipp;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getRating() {
        return rating;
    }
}
