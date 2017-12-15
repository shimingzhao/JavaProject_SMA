package sma_project;
public class Package {
    private int PackId;
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

    public Package(int PackId, int PackCatId, int LocationId, int ShipCatId, double PackWeight, double TotalCharge, int ClientId, String CenderName, String ReceiverName, String PhoneNumber, String Destination, int EmployeeId) {
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
    }

    public int getPackId() {
        return PackId;
    }

    public void setPackId(int PackId) {
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

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    @Override
    public String toString() {
        return "Package{" + "PackId=" + PackId + ", PackCatId=" + PackCatId + ", LocationId=" + LocationId + ", ShipCatId=" + ShipCatId + ", PackWeight=" + PackWeight + ", TotalCharge=" + TotalCharge + ", ClientId=" + ClientId + ", CenderName=" + CenderName + ", ReceiverName=" + ReceiverName + ", PhoneNumber=" + PhoneNumber + ", Destination=" + Destination + ", EmployeeId=" + EmployeeId + '}';
    }
    
}
