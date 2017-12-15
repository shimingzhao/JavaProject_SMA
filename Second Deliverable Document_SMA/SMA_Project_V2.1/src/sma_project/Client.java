package sma_project;

public class Client {
    private int ClientId;
    private String ClientLName;
    private String ClientFName;
    private String ClientPhone;
    private String ClientEmail;
    private String ClientAddress;
    private int PackageId;
    private int EmployeeId;  

    public Client(int ClientId, String ClientLName, String ClientFName, String ClientPhone, String ClientEmail, String ClientAddress, int PackageId, int EmployeeId) {
        this.ClientId = ClientId;
        this.ClientLName = ClientLName;
        this.ClientFName = ClientFName;
        this.ClientPhone = ClientPhone;
        this.ClientEmail = ClientEmail;
        this.ClientAddress = ClientAddress;
        this.PackageId = PackageId;
        this.EmployeeId = EmployeeId;
    }

    Client() {
        this.ClientId = 0;
        this.ClientLName = "";
        this.ClientFName = "";
        this.ClientPhone = "";
        this.ClientEmail = "";
        this.ClientAddress = "";
        this.PackageId = 0;
        this.EmployeeId = 0;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int ClientId) {
        this.ClientId = ClientId;
    }

    public String getClientLName() {
        return ClientLName;
    }

    public void setClientLName(String ClientLName) {
        this.ClientLName = ClientLName;
    }

    public String getClientFName() {
        return ClientFName;
    }

    public void setClientFName(String ClientFName) {
        this.ClientFName = ClientFName;
    }

    public String getClientPhone() {
        return ClientPhone;
    }

    public void setClientPhone(String ClientPhone) {
        this.ClientPhone = ClientPhone;
    }

    public String getClientEmail() {
        return ClientEmail;
    }

    public void setClientEmail(String ClientEmail) {
        this.ClientEmail = ClientEmail;
    }

    public String getClientAddress() {
        return ClientAddress;
    }

    public void setClientAddress(String ClientAddress) {
        this.ClientAddress = ClientAddress;
    }

    public int getPackageId() {
        return PackageId;
    }

    public void setPackageId(int PackageId) {
        this.PackageId = PackageId;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }


    @Override
    public String toString() {
        return "ClientId: " + ClientId + ", Last Name: " + ClientLName + ", First Name: " + ClientFName;
    }
    
}
