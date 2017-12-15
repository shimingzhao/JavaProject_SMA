package sma_project;
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class ProjectOracleConnection {    
    static List<Employee> EmployeeArrayList = new ArrayList();
    static List<Client> ClientArrayList = new ArrayList();
    static List<PackCategory> PackageCategoryList = new ArrayList();
    static List<ShipCategory> ShippingCategoryList = new ArrayList();
    static List<Location> LocationCategoryList = new ArrayList();
    static List<Package> PackageList = new ArrayList();
    
    static String username = "scott";
    static String password = "tiger";
    static String url = "jdbc:oracle:thin:@ localhost:1521:orcl";

    int ClientId;
    String ClientId_str,ClientLname,ClientFname,ClientPhone,ClientEmail,ClientAddress,ClientPakId,ClientEmpId;

    public static void ClientAddOracle(Client client){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO CLIENTT ";
            query = query + "(CLIENTID,LNAME,FNAME,TELEPHONE,EMAIL,ADDRESS,EMPLOYEEID,PACKAGEID) ";
            query = query + "values";
            query = query + "(" + client.getClientId() + ", '" + client.getClientLName() + "','" + client.getClientFName() 
                    + "','" + client.getClientPhone() + "','" + client.getClientEmail() + "','" + client.getClientAddress() 
                    + "'," + client.getEmployeeId() + "," + client.getPackageId() + ")";
            s.executeUpdate(query);
//            c.commit();
            c.close();
            JOptionPane.showMessageDialog(null, "Record has been created");
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for creating tables() :" + e);            
        }
    }
    
   
    public static void ClientUpdateOracle(Client client){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE CLIENTT SET CLIENTID = " + client.getClientId() + ", LNAME = '" 
                    + client.getClientLName() + "', FNAME = '" + client.getClientFName() + "', TELEPHONE = '" + client.getClientPhone()
                    + "', EMAIL = '" + client.getClientEmail() + "', ADDRESS = '" + client.getClientAddress() + "', EMPLOYEEID = " 
                    + client.getEmployeeId() + ", PACKAGEID = " + client.getPackageId();
            s.executeUpdate(query);
//            c.commit();
            c.close();
            JOptionPane.showMessageDialog(null, "Record has been updated");            
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for update record from tables() :" + e);            
        }
    }
    
    
public static Client ClientSearchOracle(String clientId)
{        
        int id = Integer.parseInt(clientId);
        Connection c = null;       
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT * FROM CLIENTT WHERE CLIENTID = " + id);             
            System.out.println("*****  s.executeQuery Load_Client *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("ClientId");
                String lname = rs.getString("LNAME");
                String fname = rs.getString("FNAME");
                String phone = rs.getString("TELEPHONE");
                String email = rs.getString("EMAIL");
                String address = rs.getString("ADDRESS");
                int pakid = rs.getInt("PACKAGEID");
                int empid = rs.getInt("EMPLOYEEID");
                Client searchClient = new Client(id,lname,fname,phone,email,address,pakid,empid);
                ClientArrayList.add(new Client(id,lname,fname,phone,email,address,pakid,empid));
                System.out.println(ClientArrayList);
                return searchClient;
            }           
            c.commit();
            c.close();
            JOptionPane.showMessageDialog(null, "Record does not exist!","Search Result",JOptionPane.ERROR_MESSAGE);
            
        }
        catch (Exception e)
        {
            try
            {
                c.rollback();
            }
            catch(Exception ee)
            {
                System.out.println("Error !");
            }
            System.out.println("Error - DataBase Mangement Loading client tables() : " + e);
        }
        return null;
    }       

    public static void ClientDeleteOracle(int id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM CLIENTT WHERE CLIENTID= " + id;
            s.executeUpdate(query);
            c.commit();
            c.close();
//            JOptionPane.showMessageDialog(null, "Record has been deleted");            
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for delete record from tables() :" + e);            
        }
    }
    
    public static List ClientSearchListOracle(){
        ClientArrayList.clear();        
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            System.out.println("*********** LIST ALL RECORDS FROM TABLE ***********");
            rs = s.executeQuery("SELECT * FROM CLIENTT");
            System.out.println("*****  s.executeQuery Client List *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("ClientId");
                String lname = rs.getString("LNAME");
                String fname = rs.getString("FNAME");
                String phone = rs.getString("TELEPHONE");
                String email = rs.getString("EMAIL");
                String address = rs.getString("ADDRESS");
                int pakid = rs.getInt("PACKAGEID");
                int empid = rs.getInt("EMPLOYEEID");
                ClientArrayList.add(new Client(id1,lname,fname,phone,email,address,pakid,empid));
            }
            c.commit();
            c.close();      
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for delete record from tables() :" + e);            
        }
        System.out.println(ClientArrayList.toString());
        return ClientArrayList;
    }  
    
    public static void EmployeeAddOracle(Employee employee){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO EMPLOYEET ";
            query = query + "(EMPLOYEEID,LNAME,FNAME,TELEPHONE,EMAIL) ";
            query = query + "values";
            query = query + "(" + employee.getEmployeeId() + ", '" + employee.getEmployeeLName() + "','" + employee.getEmployeeFName() 
                    + "','" + employee.getEmployeePhone() + "','" + employee.getEmployeeEmail() + "')";
            s.executeUpdate(query);
//            c.commit();
            c.close();
            JOptionPane.showMessageDialog(null, "Record has been created");
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for creating tables() :" + e);            
        }
    }
    
        public static void EmployeeUpdateOracle(Employee employee){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE EMPLOYEET SET EMPLOYEEID = " + employee.getEmployeeId() + ", LNAME = '" 
                    + employee.getEmployeeLName() + "', FNAME = '" + employee.getEmployeeFName() + "', TELEPHONE = '" + employee.getEmployeePhone()
                    + "', EMAIL = '" + employee.getEmployeeEmail()+"'";
            s.executeUpdate(query);
//            c.commit();
            c.close();
            JOptionPane.showMessageDialog(null, "Record has been updated");            
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for update record from tables() :" + e);            
        }
    }
    
    
public static Employee EmployeeSearchOracle(String employeeId)
{        
        int id = Integer.parseInt(employeeId);
        Connection c = null;       
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT * FROM EMPLOYEET WHERE EMPLOYEEID = " + id);             
            System.out.println("*****  s.executeQuery Load_Client *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("EMPLOYEEID");
                String lname = rs.getString("LNAME");
                String fname = rs.getString("FNAME");
                String phone = rs.getString("TELEPHONE");
                String email = rs.getString("EMAIL");
                Employee searchEmployee = new Employee(id,lname,fname,phone,email);
                EmployeeArrayList.add(new Employee(id,lname,fname,phone,email));
                System.out.println(EmployeeArrayList);
                return searchEmployee;
            }           
            c.commit();
            c.close();
            JOptionPane.showMessageDialog(null, "Record does not exist!","Search Result",JOptionPane.ERROR_MESSAGE);
            
        }
        catch (Exception e)
        {
            try
            {
                c.rollback();
            }
            catch(Exception ee)
            {
                System.out.println("Error !");
            }
            System.out.println("Error - DataBase Mangement Loading employee tables() : " + e);
        }
        return null;
    }       

    public static void EmployeeDeleteOracle(int id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM EMPLOYEET WHERE EMPLOYEEID= " + id;
            s.executeUpdate(query);
            c.commit();
            c.close();
//            JOptionPane.showMessageDialog(null, "Record has been deleted");            
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for delete record from tables() :" + e);            
        }
    }
    
    public static List EmployeeSearchListOracle(){
        EmployeeArrayList.clear();        
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            System.out.println("*********** LIST ALL RECORDS FROM TABLE ***********");
            rs = s.executeQuery("SELECT * FROM EMPLOYEET");
            System.out.println("*****  s.executeQuery Client List *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("EmployeeId");
                String lname = rs.getString("LNAME");
                String fname = rs.getString("FNAME");
                String phone = rs.getString("TELEPHONE");
                String email = rs.getString("EMAIL");
                EmployeeArrayList.add(new Employee(id1,lname,fname,phone,email));
            }
            c.commit();
            c.close();      
        }
        catch(Exception e){
            try{
                c.rollback();
            }
            catch(Exception ee){
                System.out.println("Error!");
            }
            System.out.println("Error - Database management for delete record from tables() :" + e);            
        }
        System.out.println(EmployeeArrayList.toString());
        return EmployeeArrayList;
    }  
}
