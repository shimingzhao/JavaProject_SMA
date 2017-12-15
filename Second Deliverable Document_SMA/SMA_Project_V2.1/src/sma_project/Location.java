package sma_project;

public class Location {
    private int LocationId;
    private double LocationPrice;
    private String LocationDesc;

    public Location(int LocationId, double LocationPrice, String LocationDesc) {
        this.LocationId = LocationId;
        this.LocationPrice = LocationPrice;
        this.LocationDesc = LocationDesc;
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
        return "Location{" + "LocationId=" + LocationId + ", LocationPrice=" + LocationPrice + ", LocationDesc=" + LocationDesc + '}';
    }
    
}
