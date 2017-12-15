package sma_project;

import java.text.DecimalFormat;

public class PackCategory {
    private int PackCatId;
    private double PackCatPrice;
    private String PackCatDesc;
    DecimalFormat df = new DecimalFormat("#0.00");

    public PackCategory(int PackCatId, double PackCatPrice, String PackCatDesc) {
        this.PackCatId = PackCatId;
        this.PackCatPrice = PackCatPrice;
        this.PackCatDesc = PackCatDesc;
    }

    public PackCategory() {
        this.PackCatId = 0;
        this.PackCatPrice = 0;
        this.PackCatDesc = "";
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
        return "Package Category Id: " + String.format("%03d",PackCatId) + ", Price: $" + df.format(PackCatPrice) + ", Description: " + PackCatDesc;
    }
    
    
}
