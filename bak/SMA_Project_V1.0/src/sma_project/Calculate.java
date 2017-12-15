package sma_project;

import java.text.*;

public class Calculate {
    double weight;
    double shipCatPrice;
    double packCatPrice;
    double locationPrice;
    double totalCharge;
    
    public Calculate(double wei, double ship, double pak, double loc) {  
        this.weight = wei;
        this.shipCatPrice = ship;
        this.packCatPrice = pak;
        this.locationPrice = loc;
        totalCharge = 5 * weight + shipCatPrice + packCatPrice + locationPrice;
    }   

    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.00"); 
        return "Calculate Total Charge\n\n" + "Package weight charge: $" 
                + formatter.format(weight) + "\nShipping method charge: $" 
                + formatter.format(shipCatPrice) + "\nPackage category charge: $" 
                + formatter.format(packCatPrice) + "\nLocation charge: $" 
                + formatter.format(locationPrice) + "\n\nTotal Charge: $" 
                + formatter.format(totalCharge);
    }
    
}
