package sma_project;

import java.text.DecimalFormat;

public class Package {
    private long PackId;
    private int PackCatId;
    private int LocationId;
    private int ShipCatId;
    private double PackWeight;
    private double TotalCharge;
    private int ClientId;
    private String CenderName;
    private String ReceiverName;
    private String PhoneNumber;
    private String Destination;
    private int EmployeeId;
    private int IncreaseID;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Package(long PackId, int PackCatId, int LocationId, int ShipCatId, 
            double PackWeight, double TotalCharge, int ClientId, String CenderName, 
            String ReceiverName, String PhoneNumber, String Destination, int EmployeeId, int IncreaseID) {
        this.PackId = PackId;
        this.PackCatId = PackCatId;
        this.LocationId = LocationId;
        this.ShipCatId = ShipCatId;
        this.PackWeight = PackWeight;
        this.TotalCharge = TotalCharge;
        this.ClientId = ClientId;
        this.CenderName = CenderName;
        this.ReceiverName = ReceiverName;
        this.PhoneNumber = PhoneNumber;
        this.Destination = Destination;
        this.EmployeeId = EmployeeId;
        this.IncreaseID = IncreaseID;
    }

    Package() {
        this.PackId = 0;
        this.PackCatId = 0;
        this.LocationId = 0;
        this.ShipCatId = 0;
        this.PackWeight = 0;
        this.TotalCharge = 0;
        this.ClientId = 0;
        this.CenderName = "";
        this.ReceiverName = "";
        this.PhoneNumber = "";
        this.Destination = "";
        this.EmployeeId = 0;    
        this.IncreaseID = 0;
    }

    public long getPackId() {
        return PackId;
    }

    public void setPackId(long PackId) {
        this.PackId = PackId;
    }

    public int getPackCatId() {
        return PackCatId;
    }

    public void setPackCatId(int PackCatId) {
        this.PackCatId = PackCatId;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int LocationId) {
        this.LocationId = LocationId;
    }

    public int getShipCatId() {
        return ShipCatId;
    }

    public void setShipCatId(int ShipCatId) {
        this.ShipCatId = ShipCatId;
    }

    public double getPackWeight() {
        return PackWeight;
    }

    public void setPackWeight(double PackWeight) {
        this.PackWeight = PackWeight;
    }

    public double getTotalCharge() {
        return TotalCharge;
    }

    public void setTotalCharge(double TotalCharge) {
        this.TotalCharge = TotalCharge;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int ClientId) {
        this.ClientId = ClientId;
    }

    public String getCenderName() {
        return CenderName;
    }

    public void setCenderName(String CenderName) {
        this.CenderName = CenderName;
    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public void setReceiverName(String ReceiverName) {
        this.ReceiverName = ReceiverName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public int getIncreaseID() {
        return IncreaseID;
    }

    public void setIncreaseID(int IncreaseID) {
        this.IncreaseID = IncreaseID;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }
    @Override
    public String toString() {
        return "Package Id: " + PackId +", Weight(Lb): " + PackWeight + ", Total Charge: $" 
                + df.format(TotalCharge) +", Sender Name: " + CenderName + ", Receiver Name: " 
                + ReceiverName + ", PhoneNumber: " + PhoneNumber + ", Destination: " + Destination;
    }
    
}
