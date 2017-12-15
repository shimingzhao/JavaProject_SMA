package sma_project;

public class Employee {
    private int EmployeeId;
    private String EmployeeLName;
    private String EmployeeFName;
    private String EmployeePhone;
    private String EmployeeEmail; 

    public Employee(int EmployeeId, String EmployeeLName, String EmployeeFName, String EmployeePhone, String EmployeeEmail) {
        this.EmployeeId = EmployeeId;
        this.EmployeeLName = EmployeeLName;
        this.EmployeeFName = EmployeeFName;
        this.EmployeePhone = EmployeePhone;
        this.EmployeeEmail = EmployeeEmail;

    }

    Employee() {
        this.EmployeeId = 0;
        this.EmployeeLName = "";
        this.EmployeeFName = "";
        this.EmployeePhone = "";
        this.EmployeeEmail = "";
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

    @Override
    public String toString() {
        return "Employee{" + "EmployeeId=" + EmployeeId + ", EmployeeLName=" + EmployeeLName + ", EmployeeFName=" + EmployeeFName;
    }

    
}
