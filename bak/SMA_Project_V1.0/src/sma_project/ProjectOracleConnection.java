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
    static String url = "jdbc:oracle:thin:@ localhost:1521:xe";
    
    public static void ClientAddOracle(int id, String lname, String fname, String phone, String email,
            String address, int pakid, int empid){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO CLIENTT ";
            query = query + "(CLIENTID,LNAME,FNAME,TELEPHONE,EMAIL,ADDRESS,EMPLOYEEID,PACKAGEID) ";
            query = query + "values";
            query = query + "(" + id + ", '" + lname + "','" + fname 
                    + "','" + phone + "','" + email + "','" + address 
                    + "'," + empid + "," + pakid + ")";
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
    
    public static void EmployeeAddOracle(int id, String lname, String fname, String phone, String email){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");         
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** INSERTIING RECORD INTO TABLE ***********");
            String query = "INSERT INTO EMPLOYEET ";
            query = query + "(EMPLOYEEID,LNAME,FNAME,TELEPHONE,EMAIL) ";
            query = query + "values";
            query = query + "(" + id + ", '" + lname + "','" + fname 
                    + "','" + phone + "','" + email + "')";
            s.executeUpdate(query);
//            c.commit();
            c.close();
            int DISPOSE_ON_CLOSE = ClientAddFrame.DISPOSE_ON_CLOSE;
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
    
    public static void ClientUpdateOracle(int id, String lname, String fname, String phone, String email,
        String address, int pakid, int empid){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** UPDATE RECORD FROM TABLE ***********");
            String query = "UPDATE CLIENTT SET CLIENTID = " + id + ", LNAME = '" 
                    + lname + "', FNAME = '" + fname + "', TELEPHONE = '" + phone 
                    + "', EMAIL = '" + email + "', ADDRESS = '" + address + "', EMPLOYEEID = " 
                    + empid + ", PACKAGEID = " + pakid;
            s.executeUpdate(query);
//            c.commit();
            c.close();
            int DISPOSE_ON_CLOSE = ClientAddFrame.DISPOSE_ON_CLOSE;
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
    
  
    
    public static void ClientDeleteOracle(String username, String password, 
            int id){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            c = DriverManager.getConnection(url,username,password);
            Statement s = c.createStatement();
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
            String query = "DELETE FROM CLIENTT WHERE CLIENTID= " + id;
            s.executeUpdate(query);
            c.commit();
            c.close();
            int DISPOSE_ON_CLOSE = ClientAddFrame.DISPOSE_ON_CLOSE;
            JOptionPane.showMessageDialog(null, "Record has been deleted");            
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
            System.out.println("*********** DELETE RECORD FROM TABLE ***********");
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
}
