package sma_project;
import java.sql.*;
import javax.swing.*;
public class ProjectOracleConnection {

//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        //Method which allows to connect to Oracle database
//        ClientAddtoOracle("scott","tiger");
//    }
    
    // Method for creating tables
    public static void ClientAddOracle(String username, String password, 
            int id, String lname, String fname, String phone, String email,
            String address, int pakid, int empid){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
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
    public static void ClientUpdateOracle(String username, String password, 
            int id, String lname, String fname, String phone, String email,
            String address, int pakid, int empid){
        Connection c = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
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
//            c.commit();
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
}
