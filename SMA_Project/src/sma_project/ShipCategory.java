package sma_project;
public class ShipCategory {
    private int ShipCatId;
    private double ShipCatPrice;
    private String ShipCatDesc;

    public ShipCategory(int ShipCatId, double ShipCatPrice, String ShipCatDesc) {
        this.ShipCatId = ShipCatId;
        this.ShipCatPrice = ShipCatPrice;
        this.ShipCatDesc = ShipCatDesc;
    }

    ShipCategory() {
        this.ShipCatId = 0;
        this.ShipCatPrice = 0;
        this.ShipCatDesc = "";
    }

    public int getShipCatId() {
        return ShipCatId;
    }

    public void setShipCatId(int ShipCatId) {
        this.ShipCatId = ShipCatId;
    }

    public double getShipCatPrice() {
        return ShipCatPrice;
    }

    public void setShipCatPrice(double ShipCatPrice) {
        this.ShipCatPrice = ShipCatPrice;
    }

    public String getShipCatDesc() {
        return ShipCatDesc;
    }

    public void setShipCatDesc(String ShipCatDesc) {
        this.ShipCatDesc = ShipCatDesc;
    }

    @Override
    public String toString() {
        return "ShipCategory{" + "ShipCatId=" + ShipCatId + ", ShipCatPrice=" + ShipCatPrice + ", ShipCatDesc=" + ShipCatDesc + '}';
    }
    
}
