package sma_project;
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class ProjectOracleConnection {    
    static List<Employee> EmployeeArrayList = new ArrayList();
    static List<Client> ClientArrayList = new ArrayList();
    static List<PackCategory> PackageCategoryList = new ArrayList();
    static List<ShipCategory> ShippingCategoryList = new ArrayList();
    static List<Location> LocationList = new ArrayList();
    static List<Package> PackageList = new ArrayList();
    
    static String username = "scott";
    static String password = "tiger";
    static String url = "jdbc:oracle:thin:@ localhost:1521:orcl";
        
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
            c.commit();
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
            String query = "UPDATE CLIENTT SET LNAME = '" 
                    + client.getClientLName() + "', FNAME = '" + client.getClientFName() + "', TELEPHONE = '" + client.getClientPhone()
                    + "', EMAIL = '" + client.getClientEmail() + "', ADDRESS = '" + client.getClientAddress() + "', EMPLOYEEID = " 
                    + client.getEmployeeId() + ", PACKAGEID = " + client.getPackageId()
                    + "WHERE CLIENTID = " + client.getClientId();
            s.executeUpdate(query);
            c.commit();
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
    

    
    public static Client ClientSearchOracle(int id)
    {        
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

public static int MaxClientIDSearchOracle()
{        
        Connection c = null; 
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT MAX(ClientId) FROM CLIENTT");             
            System.out.println("*****  s.executeQuery Load_Client *******");
            while ( rs.next() ) 
            {    
                int MaxId = rs.getInt("MAX(ClientId)");
                return MaxId;
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
        return -1;
    }

    public static void ClientDeleteOracle(int id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM CLIENTT WHERE CLIENTID= " + id;
            s.executeUpdate(query);
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
    }
    
    public static List<Client> ClientSearchListOracle(){
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
            c.commit();
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

    public static int MaxEmployeeIDSearchOracle()
    {        
        Connection c = null; 
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT MAX(EmployeeId) FROM employeeT");             
            System.out.println("*****  s.executeQuery Load_Employee *******");
            while ( rs.next() ) 
            {    
                int MaxId = rs.getInt("MAX(EmployeeId)");
                return MaxId;
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
        return -1;
    }
    
    public static void EmployeeUpdateOracle(Employee employee){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE EMPLOYEET SET LNAME = '" 
                    + employee.getEmployeeLName() + "', FNAME = '" + employee.getEmployeeFName() + "', TELEPHONE = '" + employee.getEmployeePhone()
                    + "', EMAIL = '" + employee.getEmployeeEmail() + "'"
                    + "WHERE EMPLOYEEID = " + employee.getEmployeeId();
            s.executeUpdate(query);
            c.commit();
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
    
    
    public static Employee EmployeeSearchOracle(int id)
    {        
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
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM EMPLOYEET WHERE EMPLOYEEID = " + id;
            s.executeUpdate(query);
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
                int id1 = rs.getInt("EMPLOYEEID");
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
    
    public static void PackCatAddOracle(PackCategory packCategory){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO PACKAGECATEGORY";
            query = query + "(PACKAGECATEGORYID,PACKAGEPRICE,PACKAGEDESC)";
            query = query + "values";
            query = query + "(" + packCategory.getPackCatId() + ", " + packCategory.getPackCatPrice() + ",'" + packCategory.getPackCatDesc()+ "')";
            s.executeUpdate(query);
            c.commit();
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
    
    public static int MaxPackCatIDSearchOracle()
    {        
        Connection c = null; 
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT MAX(PackageCategoryId) FROM PackageCategory");             
            System.out.println("*****  s.executeQuery Load_PackCat *******");
            while ( rs.next() ) 
            {    
                int MaxId = rs.getInt("MAX(PackageCategoryId)");
                return MaxId;
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
        return -1;
    }
    
    public static void PackCatUpdateOracle(PackCategory packCategory){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE PACKAGECATEGORY SET PACKAGEPRICE = " 
                    + packCategory.getPackCatPrice() + ", PACKAGEDESC = '" + packCategory.getPackCatDesc() + "'"
                    + "WHERE PACKAGECATEGORYID = " + packCategory.getPackCatId();
            s.executeUpdate(query);
            c.commit();
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
    
    
public static PackCategory PackCatSearchOracle(int id)
{        
        Connection c = null;       
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT * FROM PACKAGECATEGORY WHERE PACKAGECATEGORYID = " + id);             
            System.out.println("*****  s.executeQuery Load_Client *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("PACKAGECATEGORYID");
                double price = rs.getDouble("PACKAGEPRICE");
                String desc = rs.getString("PACKAGEDESC");

                PackCategory searchPackCategory = new PackCategory(id,price,desc);
                PackageCategoryList.add(new PackCategory(id,price,desc));
                System.out.println(PackageCategoryList);
                return searchPackCategory;
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

    public static void PackCatDeleteOracle(int id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM PACKAGECATEGORY WHERE PACKAGECATEGORYID = " + id;
            s.executeUpdate(query);
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
    }
    
    public static List<PackCategory> PackCatSearchListOracle(){
        PackageCategoryList.clear();        
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            System.out.println("*********** LIST ALL RECORDS FROM TABLE ***********");
            rs = s.executeQuery("SELECT * FROM PACKAGECATEGORY");
            System.out.println("*****  s.executeQuery Client List *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("PACKAGECATEGORYID");
                double price = rs.getDouble("PACKAGEPRICE");                
                String desc = rs.getString("PACKAGEDESC");
                PackageCategoryList.add(new PackCategory(id1,price,desc));
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
        System.out.println(PackageCategoryList.toString());
        return PackageCategoryList;
    }  
    
    public static void ShipCatAddOracle(ShipCategory shipCategory){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO SHIPPINGCATEGORY";
            query = query + "(SHIPPINGCATEGORYID,SHIPPINGPRICE,SHIPPINGDESC)";
            query = query + "values";
            query = query + "(" + shipCategory.getShipCatId() + ", " + shipCategory.getShipCatPrice() + ",'" + shipCategory.getShipCatDesc()+ "')";
            s.executeUpdate(query);
            c.commit();
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
    
    public static int MaxShipCatIDSearchOracle()
    {        
        Connection c = null; 
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT MAX(ShippingCategoryId) FROM ShippingCategory");             
            System.out.println("*****  s.executeQuery Load_Employee *******");
            while ( rs.next() ) 
            {    
                int MaxId = rs.getInt("MAX(ShippingCategoryId)");
                return MaxId;
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
        return -1;
    }
    
    public static void ShipCatUpdateOracle(ShipCategory shipCategory){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE SHIPPINGCATEGORY SET SHIPPINGPRICE = " 
                    + shipCategory.getShipCatPrice() + ", SHIPPINGDESC = '" + shipCategory.getShipCatDesc() + "'"
                    + "WHERE SHIPPINGCATEGORYID = " + shipCategory.getShipCatId();
            s.executeUpdate(query);
            c.commit();
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
    
    
    public static ShipCategory ShipCatSearchOracle(int id)
    {        
        Connection c = null;       
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT * FROM SHIPPINGCATEGORY WHERE SHIPPINGCATEGORYID = " + id);             
            System.out.println("*****  s.executeQuery Load_Client *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("SHIPPINGCATEGORYID");
                double price = rs.getDouble("SHIPPINGPRICE");
                String desc = rs.getString("SHIPPINGDESC");
                
                ShipCategory searchShipCategory = new ShipCategory(id,price,desc);
                ShippingCategoryList.add(new ShipCategory(id,price,desc));
                System.out.println(ShippingCategoryList);
                return searchShipCategory;
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

    public static void ShipCatDeleteOracle(int id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM SHIPPINGCATEGORY WHERE SHIPPINGCATEGORYID = " + id;
            s.executeUpdate(query);
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
    }
    
    public static List ShipCatSearchListOracle(){
        ShippingCategoryList.clear();        
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            System.out.println("*********** LIST ALL RECORDS FROM TABLE ***********");
            rs = s.executeQuery("SELECT * FROM SHIPPINGCATEGORY");
            System.out.println("*****  s.executeQuery Client List *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("SHIPPINGCATEGORYID");
                double price = rs.getDouble("SHIPPINGPRICE");                
                String desc = rs.getString("SHIPPINGDESC");
                ShippingCategoryList.add(new ShipCategory(id1,price,desc));
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
        System.out.println(ShippingCategoryList.toString());
        return ShippingCategoryList;
    }

    public static void LocationAddOracle(Location location){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO LOCATIONT";
            query = query + "(LOCATIONID,LOCATIONPRICE,LOCATIONDESC)";
            query = query + "values";
            query = query + "(" + location.getLocationId() + ", " + location.getLocationPrice() + ",'" + location.getLocationDesc()+ "')";
            s.executeUpdate(query);
            c.commit();
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

    public static int MaxLocationIDSearchOracle()
    {        
        Connection c = null; 
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT MAX(LocationId) FROM LocationT");             
            System.out.println("*****  s.executeQuery Load_Employee *******");
            while ( rs.next() ) 
            {    
                int MaxId = rs.getInt("MAX(LocationId)");
                return MaxId;
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
        return -1;
    }
   
    public static void LocationUpdateOracle(Location location){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE LOCATIONT SET LOCATIONPRICE = " 
                    + location.getLocationPrice() + ", LOCATIONDESC = '" + location.getLocationDesc() + "'"
                    + "WHERE LOCATIONID = " + location.getLocationId();
            s.executeUpdate(query);
            c.commit();
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
    
    
    public static Location LocationSearchOracle(int id)
    {        
        Connection c = null;       
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT * FROM LOCATIONT WHERE LOCATIONID = " + id);             
            System.out.println("*****  s.executeQuery Load_Client *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("LOCATIONID");
                double price = rs.getDouble("LOCATIONPRICE");
                String desc = rs.getString("LOCATIONDESC");
                
                Location searchLocation = new Location(id,price,desc);
                LocationList.add(new Location(id,price,desc));
                System.out.println(LocationList);
                return searchLocation;
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

    public static void LocationDeleteOracle(int id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM LOCATIONT WHERE LOCATIONID = " + id;
            s.executeUpdate(query);
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
    }
    
    public static List LocationSearchListOracle(){
        LocationList.clear();        
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            System.out.println("*********** LIST ALL RECORDS FROM TABLE ***********");
            rs = s.executeQuery("SELECT * FROM LOCATIONT");
            System.out.println("*****  s.executeQuery Client List *******");
            while ( rs.next() ) 
            {    
                int id1 = rs.getInt("LOCATIONID");
                double price = rs.getDouble("LOCATIONPRICE");                
                String desc = rs.getString("LOCATIONDESC");
                LocationList.add(new Location(id1,price,desc));
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
        System.out.println(LocationList.toString());
        return LocationList;
    } 
    public static void PackageAddOracle(Package pack){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO PACKAGET ";
            query = query + "(PACKAGEID,NAME,PACKAGECATEGORYID,WEIGHT,RECEIVERNAME,DESTINATION,"
                    + "LOCATIONID,SHIPPINGCATEGORYID,TELEPHONE,TOTALCHARGE,CLIENTID,EMPLOYEEID,ID) ";
            query = query + "values";
            query = query + "(" + pack.getPackId() + ",'" + pack.getCenderName() + "'," + pack.getPackCatId() + "," + pack.getPackWeight() + ",'" + pack.getReceiverName()
                    + "','" + pack.getDestination() + "'," + pack.getLocationId() + "," + pack.getShipCatId() + ",'" + pack.getPhoneNumber() + "'," + pack.getTotalCharge()
                    + "," + pack.getClientId() + "," + pack.getEmployeeId() + "," + pack.getIncreaseID() + ")";
            s.executeUpdate(query);
            c.commit();
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
    
    public static int MaxPackageIDSearchOracle()
    {        
        Connection c = null; 
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT MAX(Id) FROM PackageT");             
            System.out.println("*****  s.executeQuery Load_Package *******");
            while ( rs.next() ) 
            {    
                int MaxId = rs.getInt("MAX(Id)");
                return MaxId;
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
            System.out.println("Error - DataBase Mangement Loading PackageT tables() : " + e);
        }
        return -1;
    }
    
    public static void PackageUpdateOracle(Package pack){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE PACKAGET SET NAME = '" 
                    + pack.getCenderName() + "', PACKAGECATEGORYID = " + pack.getPackCatId() 
                    + ", WEIGHT = " + pack.getPackWeight() + ", RECEIVERNAME = '" + pack.getReceiverName() 
                    + "', DESTINATION = '" + pack.getDestination() + "', LOCATIONID = " + pack.getLocationId()
                    + ", SHIPPINGCATEGORYID = " + pack.getShipCatId() + ", TELEPHONE = '" + pack.getPhoneNumber()
                    + "', TOTALCHARGE = " + pack.getTotalCharge() + ", CLIENTID = " + pack.getClientId()
                    + ", EMPLOYEEID = " + pack.getEmployeeId() + ",ID = " + pack.getIncreaseID()
                    + "WHERE PACKAGEID = " + pack.getPackId();
            s.executeUpdate(query);
            c.commit();
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
    
    public static Package PackageSearchOracle(long id)
    {        
        Connection c = null;       
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            rs = s.executeQuery("SELECT * FROM PACKAGET WHERE PACKAGEID = " + id);             
            System.out.println("*****  s.executeQuery Load_Client *******");
            while ( rs.next() ) 
            {    
                long id1 = rs.getLong("PACKAGEID");
                String Name = rs.getString("NAME");
                int PackageCategoryId = rs.getInt("PACKAGECATEGORYID");
                double Weight = rs.getDouble("WEIGHT");
                String ReceiverName = rs.getString("RECEIVERNAME");
                String Destination = rs.getString("Destination");
                int LocationId = rs.getInt("LocationId");
                int ShippingCategoryId = rs.getInt("ShippingCategoryId");
                String Telephone = rs.getString("Telephone");
                double TotalCharge = rs.getDouble("TotalCharge");
                int ClientId = rs.getInt("ClientId");
                int EmployeeId = rs.getInt("EmployeeId");
                int MaxId = rs.getInt("Id");
                Package searchPackage = new Package(id, PackageCategoryId, LocationId, ShippingCategoryId, 
                                                    Weight, TotalCharge, ClientId, Name, ReceiverName, 
                                                    Telephone, Destination, EmployeeId, MaxId);
                return searchPackage;
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

    public static void PackageDeleteOracle(long id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM PACKAGET WHERE PACKAGEID = " + id;
            s.executeUpdate(query);
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
    }
    
    public static List PackageSearchListOracle(){
        PackageList.clear();        
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            ResultSet rs; 
            System.out.println("*********** LIST ALL RECORDS FROM TABLE ***********");
            rs = s.executeQuery("SELECT * FROM PACKAGET");
            System.out.println("*****  s.executeQuery Client List *******");
            while ( rs.next() ) 
            {    
                long id = rs.getLong("PACKAGEID");
                String Name = rs.getString("NAME");
                int PackageCategoryId = rs.getInt("PACKAGECATEGORYID");
                double Weight = rs.getDouble("WEIGHT");
                String ReceiverName = rs.getString("RECEIVERNAME");
                String Destination = rs.getString("Destination");
                int LocationId = rs.getInt("LocationId");
                int ShippingCategoryId = rs.getInt("ShippingCategoryId");
                String Telephone = rs.getString("Telephone");
                double TotalCharge = rs.getDouble("TotalCharge");
                int ClientId = rs.getInt("ClientId");
                int EmployeeId = rs.getInt("EmployeeId");
                int Maxid = rs.getInt("Id");
                PackageList.add(new Package(id, PackageCategoryId, LocationId, ShippingCategoryId, 
                                                    Weight, TotalCharge, ClientId, Name, ReceiverName, 
                                                    Telephone, Destination, EmployeeId, Maxid));
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
        System.out.println(PackageList.toString());
        return PackageList;
    } 
}
