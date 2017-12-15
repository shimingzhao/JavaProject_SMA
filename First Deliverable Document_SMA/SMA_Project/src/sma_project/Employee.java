package sma_project;

public class Employee {
    private int EmployeeId;
    private String EmployeeLName;
    private String EmployeeFName;
    private String EmployeePhone;
    private String EmployeeEmail;
    private String EmployeeAddress;
    private int PackageId;
    private int ClientId;  

    public Employee(int EmployeeId, String EmployeeLName, String EmployeeFName, String EmployeePhone, String EmployeeEmail, String EmployeeAddress, int PackageId, int ClientId) {
        this.EmployeeId = EmployeeId;
        this.EmployeeLName = EmployeeLName;
        this.EmployeeFName = EmployeeFName;
        this.EmployeePhone = EmployeePhone;
        this.EmployeeEmail = EmployeeEmail;
        this.EmployeeAddress = EmployeeAddress;
        this.PackageId = PackageId;
        this.ClientId = ClientId;
    }

    Employee() {
        this.EmployeeId = 0;
        this.EmployeeLName = "";
        this.EmployeeFName = "";
        this.EmployeePhone = "";
        this.EmployeeEmail = "";
        this.EmployeeAddress = "";
        this.PackageId = 0;
        this.ClientId = 0;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeLName() {
        return EmployeeLName;
    }

    public void setEmployeeLName(String EmployeeLName) {
        this.EmployeeLName = EmployeeLName;
    }

    public String getEmployeeFName() {
        return EmployeeFName;
    }

    public void setEmployeeFName(String EmployeeFName) {
        this.EmployeeFName = EmployeeFName;
    }

    public String getEmployeePhone() {
        return EmployeePhone;
    }

    public void setEmployeePhone(String EmployeePhone) {
        this.EmployeePhone = EmployeePhone;
    }

    public String getEmployeeEmail() {
        return EmployeeEmail;
    }

    public void setEmployeeEmail(String EmployeeEmail) {
        this.EmployeeEmail = EmployeeEmail;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String EmployeeAddress) {
        this.EmployeeAddress = EmployeeAddress;
    }

    public int getPackageId() {
        return PackageId;
    }

    public void setPackageId(int PackageId) {
        this.PackageId = PackageId;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int ClientId) {
        this.ClientId = ClientId;
    }


    @Override
    public String toString() {
        return "Employee{" + "EmployeeId=" + EmployeeId + ", EmployeeLName=" + EmployeeLName + ", EmployeeFName=" + EmployeeFName + ", EmployeePhone=" + EmployeePhone + ", EmployeeEmail=" + EmployeeEmail + ", EmployeeAddress=" + EmployeeAddress + ", PackageId=" + PackageId + ", ClientId=" + ClientId + '}';
    }
    
}
