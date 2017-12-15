package sma_project;

import java.text.DecimalFormat;

public class Location {
    private int LocationId;
    private double LocationPrice;
    private String LocationDesc;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Location(int LocationId, double LocationPrice, String LocationDesc) {
        this.LocationId = LocationId;
        this.LocationPrice = LocationPrice;
        this.LocationDesc = LocationDesc;
    }

    Location() {
        this.LocationId = 0;
        this.LocationPrice = 0;
        this.LocationDesc = "";        
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int LocationId) {
        this.LocationId = LocationId;
    }

    public double getLocationPrice() {
        return LocationPrice;
    }

    public void setLocationPrice(double LocationPrice) {
        this.LocationPrice = LocationPrice;
    }

    public String getLocationDesc() {
        return LocationDesc;
    }

    public void setLocationDesc(String LocationDesc) {
        this.LocationDesc = LocationDesc;
    }

    @Override
    public String toString() {
        return "LocationId: " + String.format("%03d",LocationId) + ", Price: $" + df.format(LocationPrice) + ", Description: " + LocationDesc;
    }
    
}
