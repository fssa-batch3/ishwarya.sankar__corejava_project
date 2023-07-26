package Ishutest.java;
import java.sql.*;

public class JdbcDemo
{
    public static void main(String[] args) throws Exception {
    	delete();
    }

    public static void readRecords() throws Exception {
        String url = "jdbc:mysql://localhost:3306/own";
        String userName = "root";
        String passWord = "123456";

        String query = "SELECT * FROM employee";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        
        while (rs.next()) {
            int empId = rs.getInt(1);
            String empName = rs.getString(2);
            int salary = rs.getInt(3);
            System.out.println("Id is " + empId);
            System.out.println("Name is " + empName);
            System.out.println("Salary is " + salary);
        }
        
        rs.close();
        smt.close();
        con.close();
    }

    // insert
    public static void insertRecords() throws Exception {
        String url = "jdbc:mysql://localhost:3306/own";
        String userName = "root";
        String passWord = "123456";

//       String query = "INSERT INTO employee VALUES (09, 'abi', 1975)";
//        String query = "INSERT INTO employee VALUES (?, ?, ?)";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement smt = con.createStatement();
//        int rows = smt.executeUpdate(query);
//        System.out.println("No of rows inserted: " + rows);

}
    //?
    // insert with variables
    public static void insertVariable() throws Exception {
        String url = "jdbc:mysql://localhost:3306/own";
        String userName = "root";
        String passWord = "123456";
        int id = 5;
        String name = "mukesh";
        int salary = 234567890;
        

//       String query = "INSERT INTO employee VALUES (" + id +","+name + ","+salary +")";
       String query = "INSERT INTO employee VALUES (?, ?, ?)";
        Connection con = DriverManager.getConnection(url, userName, passWord);
       PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1,id);
        pst.setString(1,name);
        pst.setInt(1,salary);
        
        pst.executeUpdate();
        int rows = pst .executeUpdate(query);
        
        
        System.out.println("No of rows inserted: " + rows);

}
    
    // delete 
    public static void delete() throws Exception {
        String url = "jdbc:mysql://localhost:3306/own";
        String userName = "root";
        String passWord = "123456";
        int id = 5;
        

//       String query = "INSERT INTO employee VALUES (" + id +","+name + ","+salary +")";
       String query = "delete from employee where emp_id "+ id;
        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement smt = con.createStatement();
        int rows = smt.executeUpdate(query);
 
        
        
        System.out.println("No of rows inserted: " + rows);
    
}
}