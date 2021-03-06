package sma_project;

public class PackCategory {
    private int PackCatId;
    private double PackCatPrice;
    private String PackCatDesc;

    public PackCategory(int PackCatId, double PackCatPrice, String PackCatDesc) {
        this.PackCatId = PackCatId;
        this.PackCatPrice = PackCatPrice;
        this.PackCatDesc = PackCatDesc;
    }

    public int getPackCatId() {
        return PackCatId;
    }

    public void setPackCatId(int PackCatId) {
        this.PackCatId = PackCatId;
    }

    public double getPackCatPrice() {
        return PackCatPrice;
    }

    public void setPackCatPrice(double PackCatPrice) {
        this.PackCatPrice = PackCatPrice;
    }

    public String getPackCatDesc() {
        return PackCatDesc;
    }

    public void setPackCatDesc(String PackCatDesc) {
        this.PackCatDesc = PackCatDesc;
    }

    @Override
    public String toString() {
        return "PackCategory{" + "PackCatId=" + PackCatId + ", PackCatPrice=" + PackCatPrice + ", PackCatDesc=" + PackCatDesc + '}';
    }
    
    
}
